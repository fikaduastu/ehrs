<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE HTML>
<html>
<head>
<title>Doctor index</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Augment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel='stylesheet' type='text/css' />
	<!-- Graph CSS -->
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.css" rel="stylesheet" /> 
	<!-- jQuery -->
<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
	<!-- lined-icons -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/icon-font.min.css" type='text/css' />
	<!-- /js -->
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script>
<!-- //js-->
</head>
<body>
   <div class="page-container">
   <!--/content-inner-->
	<div class="left-content">
	   <div class="inner-content">
		<!-- header-starts -->
			<!-- header-starts -->
			<div class="header-section">
						<!--menu-right-->
						<div class="top_menu">
						       
								
							<!--/profile_details-->
								<div class="profile_details_left">
									<ul class="nofitications-dropdown">
											<li class="dropdown note dra-down">
													   
																		<script type="text/javascript">
			
																	function DropDown(el) {
																		this.dd = el;
																		this.placeholder = this.dd.children('span');
																		this.opts = this.dd.find('ul.dropdown > li');
																		this.val = '';
																		this.index = -1;
																		this.initEvents();
																	}
																	DropDown.prototype = {
																		initEvents : function() {
																			var obj = this;

																			obj.dd.on('click', function(event){
																				$(this).toggleClass('active');
																				return false;
																			});

																			obj.opts.on('click',function(){
																				var opt = $(this);
																				obj.val = opt.text();
																				obj.index = opt.index();
																				obj.placeholder.text(obj.val);
																			});
																		},
																		getValue : function() {
																			return this.val;
																		},
																		getIndex : function() {
																			return this.index;
																		}
																	}

																	$(function() {

																		var dd = new DropDown( $('#dd') );

																		$(document).click(function() {
																			// all dropdowns
																			$('.wrapper-dropdown-3').removeClass('active');
																		});

																	});

																</script>
										    </li>
									  
										
							<li class="dropdown note">
								<a href=""   aria-expanded="false"> </a>

									
							</li>	
						   							   		
							<div class="clearfix"></div>	
								</ul>
							</div>
							<div class="clearfix"></div>	
							<!--//profile_details-->
						</div>
						<!--//menu-right-->
					<div class="clearfix"></div>
				</div>
					<!-- //header-ends -->
						<!--outter-wp-->
							<div class="outter-wp">
									<!--sub-heard-part-->
									  <div class="sub-heard-part">
									   <ol class="breadcrumb m-b-0">
											<li><a href="index.html">Home</a></li>
											<li class="active"> Medical certificate</li>
										</ol>
									   </div>
								  <!--//sub-heard-part-->
									<div class="graph-visual tables-main">
										
												<div class="graph">
														 <div class="block-page">
														



                                                                         <div class="set-1">
																			<div class="graph-2 general">
																				
																					<div class="grid-1">
																							<div class="form-body">
																									<form class="form-horizontal"  action="showGeneratedMedicalCertificate" method="GET">
																										<div class="form-group">
																											<label for="focusedinput" class="col-sm-2 control-label">Profile Id</label>
																											<div class="col-sm-8">
																												<input type="text" required="required" class="form-control1" name="id" placeholder="Default Input">
																											</div>
																											
																										</div>
			

																						<div class="form-group button-2">
																						  <button type="submit" class="btn btn-primary">Submit</button>
																						  <button type="reset" class="btn btn-default">Reset</button>
																						</div>

																									</form>
																							</div>

																					</div>
																				</div>
																			</div>







                                                        
														  
										    </div>
										</div>
									</div>
									<!--//outer-wp-->
									 <!--footer section start-->
										<footer>
										   <p>&copy 2020 Electronic Health Record System . All Rights Reserved </p>
										</footer>
									<!--footer section end-->
								</div>
							</div>
				<!--//content-inner-->
				<div class="sidebar-menu">
					<header class="logo">
					<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="doctorIndex"> <span id="logo"> <h1>NWEHR</h1></span> 
					<!--<img id="logo" src="" alt="Logo"/>--> 
				  </a> 
				</header>
			<div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
			<!--/down-->
							<div class="down">	
									  <a href="doctorIndex"><img src="${pageContext.request.contextPath}/resources/images/in10.jpg"></a>
									  <a href="doctorIndex"><span class=" name-caret">Doctor</span></a>
									 <p>Doctor in NWEHR</p>
									<ul>
									
										<li><a class="tooltips" href="logout"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
										</ul>
									</div>
							   <!--//down-->
                           <div class="menu">
				<ul id="menu" >
										<li><a href="doctorIndex"><i class="fa fa-tachometer"></i> <span>Home</span></a></li>
										 <li id="menu-academico" ><a href="createPatient"><i class="fa fa-table"></i> <span>create Patient</span> <span class="" style="float: right"></span></a>
										   <ul id="menu-academico-sub" >
											
										  </ul>
										</li>
										 <li id="menu-academico" ><a href="createPhysicalExamination"><i class="fa fa-file-text-o"></i> <span>Physical Examination</span> <span class="" style="float: right"></span></a>	 
										 </li>				
										 <li id="menu-academico" ><a href="createExaminationAssesment"><i class="fa fa-file-text-o"></i> <span>Examination Assesment</span> <span class="" style="float: right"></span></a></li>
										 <li id="menu-academico" ><a href="createBiologicalDetail"><i class="fa fa-file-text-o"></i> <span>Biological Detailt</span> <span class="" style="float: right"></span></a></li>
										<li id="menu-academico" ><a href="createBirthRecord"><i class="fa fa-file-text-o"></i> <span>Birth Record</span> <span class="" style="float: right"></span></a></li>
										 <li id="menu-academico" ><a href="createDeathRecord"><i class="fa fa-file-text-o"></i> <span>Death Record</span> <span class="" style="float: right"></span></a></li>
										  <li id="menu-academico" ><a href="generatePatientHistory"><i class="fa fa-file-text-o"></i> <span>Generate Patient History</span> <span class="" style="float: right"></span></a></li>
										 <li id="menu-academico" ><a href="generateMedicalCertificate"><i class="fa fa-file-text-o"></i> <span>Generate Medical Certificate</span> <span class="" style="float: right"></span></a></li>
									 </ul>					
								 
							<script>
							var toggle = true;
										
							$(".sidebar-icon").click(function() {                
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }
											
											toggle = !toggle;
										});
							</script>
<!--js -->
	<script src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>