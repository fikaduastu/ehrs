package com.ehrs.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ehrs.dao.BiologicalDetailDao;
import com.ehrs.dao.BirthRecordDao;
import com.ehrs.dao.DeathRecordDao;
import com.ehrs.dao.ExaminationAssesmentDao;
import com.ehrs.dao.HealthCenterDao;
import com.ehrs.dao.HematologyFormDao;
import com.ehrs.dao.PhysicalExaminationDao;
import com.ehrs.dao.ProfileDao;
import com.ehrs.dao.StoolFormDao;
import com.ehrs.dao.UrineFormDao;
import com.ehrs.dao.UserDao;
import com.ehrs.dao.WoredaDao;

import com.ehrs.entity.biologicaldetail;
import com.ehrs.entity.birthrecord;
import com.ehrs.entity.deathrecord;
import com.ehrs.entity.examinationassesment;
import com.ehrs.entity.healthcenter;
import com.ehrs.entity.hematologyform;
import com.ehrs.entity.physicalexamination;
import com.ehrs.entity.profile;
import com.ehrs.entity.stoolform;
import com.ehrs.entity.urineform;
import com.ehrs.entity.user;
import com.ehrs.entity.woreda;
import com.ehrs.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// insert birth record, death record, biological detail, user id
	@Autowired
	private birthrecord birthRecord;
	
	@Autowired
	private deathrecord deathRecord;
	
	@Autowired
	private biologicaldetail biologicalDetail;
	
	@Autowired
	private user user;
	
	@Autowired
	private examinationassesment examinationAssesment;
	
	@Autowired
	private ExaminationAssesmentController examinationAssesmentController;
	
	@Autowired
	private profile profile;
	
	@Autowired
	private UrineFormController urineFormController;
	
	@Autowired
	private HematologyFormController hematologyFormController;
	
	@Autowired
	private StoolFormController stoolFormController;
	
	
	@Autowired
	private ExaminationAssesmentDao examinationAssesmentDao;
	
	@Autowired
	private ProfileDao profileDao;

	@Autowired
	private HealthCenterDao healthCenterDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private WoredaDao woredaDao;
	
	@Autowired 
	private BirthRecordDao birthRecordDao;
	
	@Autowired 
	private BirthRecordController birthRecordController;
	
	@Autowired
	private DeathRecordDao deathRecordDao;
	
	@Autowired
	private DeathRecordController deathRecordController;
	
	@Autowired
	private BiologicalDetailDao biologicalDetailDao;
	
	@Autowired
	private BiologicalDetailController biologicalDetailController;
	
	@Autowired
	private ProfileController profileController;
	
	@Autowired
	private urineform urineForm;
	
	@Autowired
	private stoolform stoolForm;
	
	@Autowired
	private hematologyform hematologyForm;
	
	@Autowired
	private physicalexamination physicalExamination;
	
	@Autowired
	private StoolFormDao stoolFormDao;
	
	@Autowired
	private UrineFormDao urineFormDao;
	
	@Autowired
	private HematologyFormDao hematologyFormDao;
	
	@Autowired
	private PhysicalExaminationDao physicalExaminationDao;
	
	@Autowired
	private PhysicalExaminationController physicalExaminationController;
	
	
	
	@RequestMapping("/showAllHospitalUser")
	public String showAllHospitalUser(Model theModel,HttpServletRequest request,HttpServletResponse response)
	{
		
		List<user> user = userDao.showAllUser();
		theModel.addAttribute("users", user);
		return "showAllHospitalUser";
	}
	
	@RequestMapping("showGeneratedMedicalCertificate")
	public String showGeneratedMedicalCertificate(@RequestParam("id") int id,Model theModel,HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		profile profile = profileDao.getProfile(id);
		birthrecord br = profile.getBirthRecord();
		String dob = br.getDateOfBirth();
		
		String patient = profile.getFirstName() +" "+ profile.getMiddleName();
		session.setAttribute("patient",patient);
		session.setAttribute("dob", dob);
		
		return "showGeneratedMedicalCertificate";
	}
	
	@RequestMapping("showGeneratedMedicalCertificateHo")
	public String showGeneratedMedicalCertificateHo(Model theModel)
	{

		return "showGeneratedMedicalCertificateHo";
	}
	
	@RequestMapping("/showGeneratedPatientHistory")
	public String showGeneratedPatientHistory(@RequestParam("id") int id,Model theModel) throws Exception
	{
		profile pro = profileDao.getProfile(id);
		System.out.println(pro);
		List<examinationassesment> ea = examinationAssesmentDao.showAllExaminationAssesment(pro);
		theModel.addAttribute("examinationassesment", ea);
		return "showGeneratedPatientHistory";
	}
	
	@RequestMapping("/showGeneratedPatientHistoryHo")
	public String showGeneratedPatientHistoryHo(@RequestParam("id") int id,Model theModel) throws Exception
	{
		profile pro = profileDao.getProfile(id);
		List<examinationassesment> examinationAssesment = examinationAssesmentDao.showAllExaminationAssesment(pro);
		theModel.addAttribute("examinationAssesment", examinationAssesment);
		return "showGeneratedPatientHistoryHo";
	}
	
	@RequestMapping("/createUser")
	public String createUser(HttpServletRequest request, HttpServletResponse reponse)
	{
		return "createUser";
	}
	
	@RequestMapping("/createPatient")
	public String createPatient()
	{
		return "createPatient";
	}	
	
	@RequestMapping("/createPatientHo")
	public String createPatientHo()
	{
		return "createPatientHo";
	}	
	
	@RequestMapping("/createPatientEncoder")
	public String createPatientEncoder()
	{
		return "createPatientEncoder";
	}	
	
	
	@RequestMapping("/createBirthRecordHo")
	public String createBirthRecordHo()
	{
		return "createBirthRecordHo";
	}
	
	@RequestMapping("/createBirthRecordEncoder")
	public String createBirthRecordEncoder()
	{
		return "createBirthRecordEncoder";
	}
	@RequestMapping("/createBirthRecord")
	public String createBirthRecord()
	{
		return "createBirthRecord";
	}
	
	@RequestMapping("/createBirthRecordNurse")
	public String createBirthRecordNurse()
	{
		return "createBirthRecordNurse";
	}
	
	@RequestMapping("/createDeathRecord")
	public String createDeathRecord()
	{
		return "createDeathRecord";
	}
	@RequestMapping("/createDeathRecordEncoder")
	public String createDeathRecordEncoder()
	{
		return "createDeathRecordEncoder";
	}
	
	@RequestMapping("/createDeathRecordNurse")
	public String createDeathRecordNurse()
	{
		return "createDeathRecordNurse";
	}
	
	@RequestMapping("/createDeathRecordHo")
	public String createDeathRecordHo()
	{
		return "createDeathRecordHo";
	}
	
	@RequestMapping("/createBiologicalDetail")
	public String createBiologicalDetail()
	{
		return "createBiologicalDetail";
	}
	
	@RequestMapping("/createBiologicalDetailNurse")
	public String createBiologicalDetailNurse()
	{
		return "createBiologicalDetailNurse";
	}
	
	@RequestMapping("/createBiologicalDetailHo")
	public String createBiologicalDetailHo()
	{
		return "createBiologicalDetailHo";
	}
	
	@RequestMapping("/createBiologicalDetailEncoder")
	public String createBiologicalDetailEncoder()
	{
		return "createBiologicalDetailEncoder";
	}
	
	@RequestMapping("/generateMedicalCertificate")
	public String generateMedicalCertificate()
	{
		return "generateMedicalCertificate";
	}
	
	@RequestMapping("/generateMedicalCertificateHo")
	public String generateMedicalCertificateHo()
	{
		return "generateMedicalCertificateHo";
	}
	
	@RequestMapping("/generatePatientHistory")
	public String generatePatientHistory()
	{
		return "generatePatientHistory";
	}
	
	@RequestMapping("/generatePatientHistoryHo")
	public String generatePatientHistoryHo()
	{
		return "generatePatientHistoryHo";
	}
	
	@RequestMapping("/createPhysicalExamination")
	public String createPhysicalExamination()
	{
		return "createPhysicalExamination";
	}
	@RequestMapping("/createPhysicalExaminationHo")
	public String createPhysicalExaminationHo()
	{
		return "createPhysicalExaminationHo";
	}
	@RequestMapping("/createPhysicalExaminationNurse")
	public String createPhysicalExaminationNurse()
	{
		return "createPhysicalExaminationNurse";
	}
	
	@RequestMapping("/createPhysicalExaminationEncoder")
	public String createPhysicalExaminationEncoder()
	{
		return "createPhysicalExaminationEncoder";
	}
	
	@RequestMapping("/createExaminationAssesment")
	public String createExaminationAssesment()
	{
		return "createExaminationAssesment";
	}
	
	@RequestMapping("/createExaminationAssesmentHo")
	public String createExaminationAssesmentHo()
	{
		return "createExaminationAssesmentHo";
	}
	
	@RequestMapping("/createExaminationAssesmentEncoder")
	public String createExaminationAssesmentEncoder()
	{
		return "createExaminationAssesmentEncoder";
	}
	@RequestMapping("/showUserLoginForm")
	public String showUserLoginForm()
	{
		return "userLoginForm";
	}
	
	@RequestMapping("/doctorIndex")
	public String doctorIndex(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		/*
		 * String position = (String)session.getAttribute("position"); if
		 * (position.equals("doctor"))
		 */
		return "doctorIndex";
		/*
		 * else return "redirect:/";
		 */
		
	}
	
	@RequestMapping("/hoIndex")
	public String hoIndex(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		String position = (String)session.getAttribute("position");
		if (position.equals("ho"))
		return "hoIndex";
		return "redirect:/";
		
	}
	
	@RequestMapping("/nurseIndex")
	public String nurseIndex(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		String position = (String)session.getAttribute("position");
		if (position.equals("nurse"))
		return "nurseIndex";
		return "redirect:/";
	}
	

	@RequestMapping("/dataEncoderIndex")
	public String dataEncoderIndex(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		String position = (String)session.getAttribute("position");
	//	if (position.equals("data encoder"))
		return "dataEncoderIndex";
	//	return "redirect:/user/logout";
		
	}
	@RequestMapping("/laboratoristIndex")
	public String laboratoristIndex(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		String position = (String)session.getAttribute("position");
		if (position.equals("laboratorist"))
		return "laboratoristIndex";
		return "redirect:/";
		
	}
	
	@RequestMapping("/hospitalAdmin")
	public String hospitalAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		String position = (String)session.getAttribute("position");
		if (position.equals("hospital admin"))
		return "hospitalAdmin";
		else return "redirect:/";
		
	}
	
	@RequestMapping("/showAddUser")
	public String showAddUser(HttpServletRequest request,HttpServletResponse response)
	{
		return "showAddUser";
	}
	
	@RequestMapping("/showUserUpdateForm")
	public String showUserUpdateForm()
	{
		return "userUpdateForm";
	}
	
	@RequestMapping("/showUserDeleteForm")
	public String showUserDeleteForm()
	{
		return "userDeleteForm";
	}
	
	@RequestMapping("/showUserReadForm")
	public String showUserReadForm()
	{
		return "userReadForm";
	}
	 @RequestMapping("/userLogin")
	 public String login(HttpServletRequest request,HttpServletResponse response) {
		   
		   HttpSession session = (HttpSession) request.getSession();
		   String email =request.getParameter("email");
		   String password = request.getParameter("password");
		   System.out.println(email+""+password);
		   user = userService.login(email,password);
		   if (user.equals(null))
		   {
	   			session.setAttribute("ErrorMessage", "Email/Password does not exist");
				return "userLoginForm";
		   }
		   else if(user.getPosition().equals("doctor"))
		   {
			   
			   addAdminInSession(user,session);
			   return "doctorIndex";
		   }
		   else if(user.getPosition().equals("ho"))
		   {
			   session.setAttribute("user", user);
			   addAdminInSession(user,session);
			   return "hoIndex";
		   }
		   else if(user.getPosition().equals("nurse"))
		   {
			   session.setAttribute("user", user);
			   addAdminInSession(user,session);
			   return "nurseIndex";
		   }
		   else if(user.getPosition().equals("pharmacist"))
		   {
			   session.setAttribute("user", user);
			   addAdminInSession(user,session);
			   return "pharmacistIndex";
		   }
		   else if(user.getPosition().equals("laboratorist"))
		   {
			   session.setAttribute("user", user);
			   addAdminInSession(user,session);
			   return "laboratoristIndex";
		   }
		   else if(user.getPosition().equals("hospital admin"))
		   {
			   session.setAttribute("user", user);
			   addAdminInSession(user,session);
			   return "hospitalAdmin";
		   }
		   else if(user.getPosition().equals("data encoder"))
		   {
			   session.setAttribute("user", user);
			   addAdminInSession(user,session);
			   
			   return "dataEncoderIndex";
		   }
		   else {
			   return "userLoginForm";
		   }
	   }
	   
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
	
		Date date = new Date();
		
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("userName"));
		String hName = request.getParameter("name");
		healthcenter hc = healthCenterDao.getHealthCenter(hName);
		user.setOrganizationId(hc);
		user.setCreatedAt(date.toString());
		user.setUpdatedAt("updatedAt");
		user.setPosition(request.getParameter("position"));
		user.setStatus("1");
		userService.addUser(user);
		return "redirect:/user/showAllHospitalUser";
		

	}
	
	
	public void addUser1(user user) 
	{
		userService.addUser(user);

	}
	
	@RequestMapping("/showUser")
	public void showUser(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		String position = (String)session.getAttribute("position");
		if (position.equals("hospital admin")) {
		user.setId(Integer.parseInt(request.getParameter("id")));
		
		userService.showUser(user);
		}
		
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(HttpServletRequest request,HttpServletResponse response)
	{
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setCreatedAt(request.getParameter("createdAt"));
		user.setUpdatedAt(request.getParameter("updateAt"));
		user.setPosition(request.getParameter("position"));
		user.setStatus(request.getParameter("status"));
		
		userService.updateUser(user);
		
		return null;
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("id") int id,Model theModel)
	{
		user.setId(id);
		
		userService.deleteUser(user);
		return "redirect:/user/showAllHospitalUser";
	}
	
	@RequestMapping("/showHealthCenterAdmins")
	public String showHealthCenterAdmins(Model theModel)
	{
		List<user> ad = userDao.showHealthCenterAdmins();
		theModel.addAttribute("users", ad);
		return "showHealthCenterAdmins";
		// this is for regional admins
	}
	
	@RequestMapping("/addPatient")
	public void addPatient(HttpServletRequest request, HttpServletResponse response)
	{	
		HttpSession session = request.getSession();
		String position = (String)session.getAttribute("position");
		
		if (session.getAttribute("user") != null)
		{
		biologicalDetail.setBloodType("A");
		deathRecord.setFuneralPlace("somewhere");
		birthRecord.setChildName("mama");
		user.setName("name");
		
		biologicaldetail bd = biologicalDetailDao.addBiologicalDetail(biologicalDetail);
		deathrecord dr = deathRecordDao.addDeathRecord(deathRecord);
		birthrecord br = birthRecordDao.addBirthRecord(birthRecord);
		user us = userDao.addUser1(user);
		
		profile.setBiologicalDetail(bd);
		profile.setDeathRecord(dr);
		profile.setBirthRecord(br);
		profile.setUser(us);
		
		profile.setEmmergencyContactName(request.getParameter("emmergencyContactName"));
		profile.setEmmergencyContactPhone(request.getParameter("emmergencyContactPhone"));
		profile.setFirstName(request.getParameter("firstName"));
		profile.setLastName(request.getParameter("lastName"));
		profile.setMiddleName(request.getParameter("middleName"));
		profile.setMobileNumber(request.getParameter("mobileNumber"));
		profile.setOccupation(request.getParameter("occupation"));
		profile.setHouseNumber(request.getParameter("houseNumber"));
		profile.setGender(request.getParameter("gender"));
		profile.setStatus("active");
		String woreda = request.getParameter("woreda");
		woreda wor = woredaDao.getWoreda(woreda);
		profile.setWoreda(wor);
		profileController.addProfile(profile);
		
		
		}
		
		else return "redirect:/";
	}
	
	@RequestMapping("/addDeathRecord")
	public void addDeathRecord(HttpServletRequest request,HttpServletResponse response)
	{
		deathRecord.setId(Integer.parseInt(request.getParameter("id")));
		deathRecord.setDateOfDeath(request.getParameter("dateOfDeath"));
		deathRecord.setFuneralDate(request.getParameter("funeralDate"));
		deathRecord.setFuneralPlace(request.getParameter("funeralPlace"));	
		deathRecord.setReasonForDeath(request.getParameter("reasonForDeath"));
		String woreda = request.getParameter("woreda");
		woreda wor = woredaDao.getWoreda(woreda);
		deathRecord.setWoreda(wor);
		String org = request.getParameter("healthCenter");
		healthcenter hc = healthCenterDao.getHealthCenter(org);
		deathRecord.setOrganizationId(hc);
		//System.out.println(deathRecord);
		deathRecordController.addDeathRecord(deathRecord);
		
	}
	
	@RequestMapping("/addBirthRecord")
	public void addBirthRecord(HttpServletRequest request,HttpServletResponse response)
	{
		birthRecord.setId(Integer.parseInt(request.getParameter("id")));
		birthRecord.setDateOfBirth(request.getParameter("dateOfBirth"));
		birthRecord.setMotherName(request.getParameter("motherName"));
		birthRecord.setFatherName(request.getParameter("fatherName"));
		birthRecord.setChildName(request.getParameter("childName"));
		birthRecord.setGender(request.getParameter("gender"));
		birthRecord.setWeight(Integer.parseInt(request.getParameter("weight")));
		birthRecord.setRemark(request.getParameter("remark"));
		
		String woreda = request.getParameter("woreda");
		woreda wor = woredaDao.getWoreda(woreda);
		String org = request.getParameter("healthCenter");
		healthcenter hc = healthCenterDao.getHealthCenter(org);
		
		birthRecord.setWoredaId(wor);
		birthRecord.setHealthCenter(hc);
		birthRecord.setHealthCenter(hc);
		
		birthRecordController.addBirthRecord(birthRecord);
	}
	
	@RequestMapping("/addBiologicalDetail")
	public void addBiologicalDetail(HttpServletRequest request,HttpServletResponse response)
	{
		biologicalDetail.setId(Integer.parseInt(request.getParameter("id")));
		biologicalDetail.setBloodType(request.getParameter("bloodType"));
		biologicalDetail.setDisability(request.getParameter("disability"));
		biologicalDetail.setEyeColor(request.getParameter("eyeColor"));
		biologicalDetail.setHeight(Integer.parseInt(request.getParameter("height")));
		biologicalDetail.setWeight(Integer.parseInt(request.getParameter("weight")));
		biologicalDetail.setSkinColor(request.getParameter("skinColor"));
		biologicalDetail.setHairColor(request.getParameter("hairColor"));
		
		biologicalDetailController.addBiologicalDetail(biologicalDetail);
	}
	
	@RequestMapping("/addExaminationAssesment")
	public void addExaminationAssesment(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		stoolForm.setDirectToolExam("normal");
		hematologyForm.setBloodGroup("A");
		urineForm.setPh("7");
		
		stoolform sf = stoolFormDao.addStoolForm(stoolForm);
		hematologyform hf = hematologyFormDao.addHematologyForm(hematologyForm);
		urineform uf = urineFormDao.addUrineForm(urineForm);
		
		physicalExamination.setStoolForm(sf);
		physicalExamination.setHematologyForm(hf);
		physicalExamination.setUrineForm(uf);
		physicalExamination.setBp("normal");
		
		physicalexamination pe = physicalExaminationDao.addPhysicalExamination(physicalExamination);
		
		examinationAssesment.setMrn(request.getParameter("mrn"));
		examinationAssesment.setDate(request.getParameter("date"));
		examinationAssesment.setPresentingCompliant(request.getParameter("presentingCompliant"));
		examinationAssesment.setHistoryOfPresentingCompliant(request.getParameter("historyOfPresentingCompliant"));
		examinationAssesment.setPastMedicalHistory(request.getParameter("pastMedicalHistory"));
		examinationAssesment.setDrugHistory(request.getParameter("drugHistory"));
		examinationAssesment.setFamilyHistory(request.getParameter("familyHistory"));
		examinationAssesment.setPersonalSocialHistory(request.getParameter("personalSocialHistory"));
		
		int id = Integer.parseInt(request.getParameter("id"));
		profile pro = profileDao.getProfile(id);
		String org = request.getParameter("healthCenter");
		healthcenter hc = healthCenterDao.getHealthCenter(org);
		
		examinationAssesment.setPhysicalExamination(pe);
		examinationAssesment.setProfile(pro);
		examinationAssesment.setHealthCenter(hc);
		
		examinationAssesmentController.addExaminationAssesment(examinationAssesment);
	}
	
	
	@RequestMapping("/createHematologyForm")
	public String createHematologyForm()
	{
		return "createHematologyForm";
	}
	
	@RequestMapping("/createUrineForm")
	public String createUrineForm()
	{
		return "createUrineForm";
	}
	
	@RequestMapping("/createStoolForm")
	public String createStoolForm()
	{
		return "createStoolForm";
	}
	
	
	@RequestMapping("/addHematologyForm")
	public void addHematologyForm(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		profile pro = profileDao.getProfile(id);
		examinationassesment examinationAssesment = examinationAssesmentDao.getExaminationAssesment(id);
		physicalexamination pe = examinationAssesment.getPhysicalExamination();
		hematologyform hf = pe.getHematologyForm();
		int ids = hf.getId();
		hematologyForm.setId(ids);
		
		hematologyForm.setBloodGroup(request.getParameter("bloodGroup"));
		hematologyForm.setRbc(request.getParameter("rbc"));
		hematologyForm.setCbc(request.getParameter("cbc"));
		hematologyForm.setMcv(request.getParameter("mcv"));
		hematologyForm.setMov(request.getParameter("mov"));
		hematologyForm.setEsr(request.getParameter("esr"));
		hematologyForm.setPlatletCount(request.getParameter("platletCount"));
		
		hematologyFormController.addHematologyForm(hematologyForm);
	}
	@RequestMapping("/addStoolForm")
	public void addStoolForm(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		profile pro = profileDao.getProfile(id);
		examinationassesment examinationAssesment = examinationAssesmentDao.getExaminationAssesment(id);
		physicalexamination pe = examinationAssesment.getPhysicalExamination();
		stoolform sf = pe.getStoolForm();
		int ids = sf.getId();
		stoolForm.setId(ids);
		
		stoolForm.setDirectToolExam(request.getParameter("directToolExam"));
		stoolForm.setPusCell(request.getParameter("pusCell"));
		stoolForm.setRbc(request.getParameter("rbc"));
		stoolForm.setOccultBloodCell(request.getParameter("occultBloodCell"));
		stoolForm.setHpyloriStoolAgent(request.getParameter("hpyloriStoolAgent"));
		
		stoolFormController.addStoolForm(stoolForm);
	}
	@RequestMapping("/addUrineForm")
	public void addUrineForm(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		profile pro = profileDao.getProfile(id);
		examinationassesment examinationAssesment = examinationAssesmentDao.getExaminationAssesment(id);
		physicalexamination pe = examinationAssesment.getPhysicalExamination();
		urineform uf = pe.getUrineForm();
		int ids = uf.getId();
		urineForm.setId(ids);
		
		urineForm.setWbc(request.getParameter("wbc"));
		urineForm.setRbc(request.getParameter("rbc"));
		urineForm.setCast(request.getParameter("cast"));
		urineForm.setGramStein(request.getParameter("gramStein"));
		urineForm.setWetSweat(request.getParameter("wetSweat"));
		urineForm.setGlucose(request.getParameter("glucose"));
		urineForm.setPh(request.getParameter("ph"));
		urineForm.setUricAcid(request.getParameter("uricAcid"));
		
		urineFormController.addUrineForm(urineForm);
		
	}
	
	@RequestMapping("/addPhysicalExamination")
	public void addPhysicalExamination1(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		profile pro = profileDao.getProfile(id);
		examinationassesment examinationAssesment = examinationAssesmentDao.getExaminationAssesment(id);
		physicalexamination pe = examinationAssesment.getPhysicalExamination();
		int ids = pe.getId();
		hematologyform hf = pe.getHematologyForm();
		stoolform sf = pe.getStoolForm();
		urineform uf = pe.getUrineForm();
		physicalExamination.setId(ids);
		
		physicalExamination.setVitalSign(request.getParameter("vitalSign"));
		physicalExamination.setTempreture(request.getParameter("tempreture"));
		physicalExamination.setBp(request.getParameter("bp"));
		physicalExamination.setResp(request.getParameter("resp"));
		physicalExamination.setHeet(request.getParameter("heet"));
		physicalExamination.setGland(request.getParameter("gland"));
		physicalExamination.setChest(request.getParameter("chest"));
		physicalExamination.setCvs(request.getParameter("cvs"));
		physicalExamination.setGenitoUrinary(request.getParameter("genitoUrinary"));
		physicalExamination.setMuscloSkeletal(request.getParameter("muscloSkeletal"));
		physicalExamination.setSkin(request.getParameter("skin"));
		physicalExamination.setCns(request.getParameter("cns"));
		physicalExamination.setMelto(request.getParameter("melto"));
		physicalExamination.setSensor(request.getParameter("sensor"));
		physicalExamination.setImpression(request.getParameter("impression"));
		physicalExamination.setAbdomen(request.getParameter("abdomen"));
		physicalExamination.setHematologyForm(hf);
		physicalExamination.setStoolForm(sf);
		physicalExamination.setUrineForm(uf);
		physicalExaminationController.addPhysicalExamination(physicalExamination);
	}
	
	@RequestMapping("/showGenerateMedicalCertificateHo")
	public void showGenerateMedicalCertificateHo(@RequestParam("id") int id,Model theModel)
	{
		
	}
	@RequestMapping("/showGenerateMedicalCertificate")
	public void showGenerateMedicalCertificate(@RequestParam("id") int id,Model theModel)
	{
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,HttpServletResponse response)
	{
		
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}
	
	public void addAdminInSession(user ad,HttpSession session) {
		
		session.setAttribute("user", ad);
		session.setAttribute("name",user.getName());
		session.setAttribute("id", ad.getId());
		session.setAttribute("email", ad.getEmail());
		session.setAttribute("password", ad.getPassword());
		session.setAttribute("position", ad.getPosition());
		session.setAttribute("organization", ad.getOrganizationId());
		healthcenter hcd = ad.getOrganizationId();
		String name = hcd.getName();
		session.setAttribute("organization", ad.getOrganizationId());
		session.setAttribute("org",name);
	}
}
