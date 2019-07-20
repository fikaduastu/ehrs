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
import com.ehrs.dao.HealthCenterDao;
import com.ehrs.dao.UserDao;
import com.ehrs.dao.WoredaDao;
import com.ehrs.entity.biologicaldetail;
import com.ehrs.entity.birthrecord;
import com.ehrs.entity.deathrecord;
import com.ehrs.entity.healthcenter;
import com.ehrs.entity.profile;
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
	private profile profile;
	

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
	
	
	
	@RequestMapping("/showAllHospitalUser")
	public String showAllHospitalUser(Model theModel)
	{
		List<user> user = userDao.showAllUser();
		theModel.addAttribute("users", user);
		return "showAllHospitalUser";
	}
	@RequestMapping("/createUser")
	public String createUser()
	{
		return "createUser";
	}
	
	@RequestMapping("/createPatient")
	public String createPatient()
	{
		return "createPatient";
	}	
	
	@RequestMapping("/createBirthRecord")
	public String createBirthRecord()
	{
		return "createBirthRecord";
	}
	
	@RequestMapping("/createDeathRecord")
	public String createDeathRecord()
	{
		return "createDeathRecord";
	}
	
	@RequestMapping("/createBiologicalDetail")
	public String createBiologicalDetail()
	{
		return "createBiologicalDetail";
	}
	
	@RequestMapping("/createPhysicalExamination")
	public String createPhysicalExamination()
	{
		return "createPhysicalExamination";
	}
	
	@RequestMapping("/createExaminationAssesment")
	public String createExaminationAssesment()
	{
		return "createExaminationAssesment";
	}
	
	@RequestMapping("/showUserLoginForm")
	public String showUserLoginForm()
	{
		return "userLoginForm";
	}
	
	@RequestMapping("/doctorIndex")
	public String doctorIndex()
	{
		
		return "doctorIndex";
		
	}
	
	@RequestMapping("/hoIndex")
	public String hoIndex()
	{
		
		return "hoIndex";
		
	}
	
	@RequestMapping("/nurseIndex")
	public String nurseIndex()
	{
		
		return "nurseIndex";
		
	}
	
	@RequestMapping("/pharmacistIndex")
	public String pharmacistIndex()
	{
		
		return "pharmacistIndex";
		
	}
	
	@RequestMapping("/laboratoristIndex")
	public String laboratoristIndex()
	{
		
		return "laboratoristIndex";
		
	}
	
	@RequestMapping("/hospitalAdmin")
	public String hospitalAdmin()
	{
		
		return "hospitalAdmin";
		
	}
	
	@RequestMapping("/showAddUser")
	public String showAddUser()
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
			   session.setAttribute("user", user);
			   return "doctorIndex";
		   }
		   else if(user.getPosition().equals("ho"))
		   {
			   session.setAttribute("user", user); 
			   return "hoIndex";
		   }
		   else if(user.getPosition().equals("nurse"))
		   {
			   session.setAttribute("user", user);
			   return "nurseIndex";
		   }
		   else if(user.getPosition().equals("pharmacist"))
		   {
			   session.setAttribute("user", user);
			   return "pharmacistIndex";
		   }
		   else if(user.getPosition().equals("laboratorist"))
		   {
			   session.setAttribute("user", user);
			   return "laboratoristIndex";
		   }
		   else if(user.getPosition().equals("hospital admin"))
		   {
			   session.setAttribute("user", user);
			   return "hospitalAdmin";
		   }
		   else {
			   return "userLoginForm";
		   }
	   }
	   
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request,HttpServletResponse response)
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
	
	//@RequestMapping("/addUser")
	public void addUser(user user)
	{
		
		userService.addUser(user);

	}
	
	@RequestMapping("/showUser")
	public void showUser(HttpServletRequest request,HttpServletResponse response)
	{
		user.setId(Integer.parseInt(request.getParameter("id")));
		
		userService.showUser(user);
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
		// insert birth record, death record, biological detail, user id
		
		//birthrecord birthRecord 
		
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
	public void addExaminationAssesment(HttpServletRequest request,HttpServletResponse response)
	{
		
	}
	
	@RequestMapping("/addPhysicalExamination")
	public void addPhysicalExamination(HttpServletRequest request,HttpServletResponse response)
	{
		
	}
}
