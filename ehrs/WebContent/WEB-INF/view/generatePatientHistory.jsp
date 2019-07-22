<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE HTML>
<html>
<head>
<title>federal admin index</title>
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
			<div class="header-section">
						<!--menu-right-->
						<div class="top_menu">
						        <div class="main-search">
											<form action="search.html">
											   <input type="text" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}" class="text"/>
												<input type="submit" value=""/>
											</form>
									<div class="close"><img src="images/cross.png" /></div>
								</div>
									<div class="srch"><button></button></div>
									<script type="text/javascript">
										 $('.main-search').hide();
										$('button').click(function (){
											$('.main-search').show();
											$('.main-search text').focus();
										}
										);
										$('.close').click(function(){
											$('.main-search').hide();
										});
									</script>
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
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-envelope-o"></i> <span class="badge">3</span></a>

												
													<ul class="dropdown-menu two first">
														<li>
															<div class="notification_header">
																<h3>You have 3 new messages  </h3> 
															</div>
														</li>
														<li><a href="#">
														   <div class="user_img"><img src="images/1.jpg" alt=""></div>
														   <div class="notification_desc">
															<p>Lorem ipsum dolor sit amet</p>
															<p><span>1 hour ago</span></p>
															</div>
														   <div class="clearfix"></div>	
														 </a></li>
														 <li class="odd"><a href="#">
															<div class="user_img"><img src="images/in.jpg" alt=""></div>
														   <div class="notification_desc">
															<p>Lorem ipsum dolor sit amet </p>
															<p><span>1 hour ago</span></p>
															</div>
														  <div class="clearfix"></div>	
														 </a></li>
														<li><a href="#">
														   <div class="user_img"><img src="images/in1.jpg" alt=""></div>
														   <div class="notification_desc">
															<p>Lorem ipsum dolor sit amet </p>
															<p><span>1 hour ago</span></p>
															</div>
														   <div class="clearfix"></div>	
														</a></li>
														<li>
															<div class="notification_bottom">
																<a href="#">See all messages</a>
															</div> 
														</li>
													</ul>
										</li>
										
							<li class="dropdown note">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-bell-o"></i> <span class="badge">5</span></a>

									<ul class="dropdown-menu two">
										<li>
											<div class="notification_header">
												<h3>You have 5 new notification</h3>
											</div>
										</li>
										<li><a href="#">
											<div class="user_img"><img src="images/in.jpg" alt=""></div>
										   <div class="notification_desc">
											<p>Lorem ipsum dolor sit amet</p>
											<p><span>1 hour ago</span></p>
											</div>
										  <div class="clearfix"></div>	
										 </a></li>
										 <li class="odd"><a href="#">
											<div class="user_img"><img src="images/in5.jpg" alt=""></div>
										   <div class="notification_desc">
											<p>Lorem ipsum dolor sit amet </p>
											<p><span>1 hour ago</span></p>
											</div>
										   <div class="clearfix"></div>	
										 </a></li>
										 <li><a href="#">
											<div class="user_img"><img src="images/in8.jpg" alt=""></div>
										   <div class="notification_desc">
											<p>Lorem ipsum dolor sit amet </p>
											<p><span>1 hour ago</span></p>
											</div>
										   <div class="clearfix"></div>	
										 </a></li>
										 <li>
											<div class="notification_bottom">
												<a href="#">See all notification</a>
											</div> 
										</li>
									</ul>
							</li>	
						<li class="dropdown note">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-tasks"></i> <span class="badge blue1">9</span></a>
										<ul class="dropdown-menu two">
										<li>
											<div class="notification_header">
												<h3>You have 9 pending task</h3>
											</div>
										</li>
										<li><a href="#">
												<div class="task-info">
												<span class="task-desc">Database update</span><span class="percentage">40%</span>
												<div class="clearfix"></div>	
											   </div>
												<div class="progress progress-striped active">
												 <div class="bar yellow" style="width:40%;"></div>
											</div>
										</a></li>
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">EHRs done</span><span class="percentage">90%</span>
											   <div class="clearfix"></div>	
											</div>
										   
											<div class="progress progress-striped active">
												 <div class="bar green" style="width:90%;"></div>
											</div>
										</a></li>
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">Mobile App</span><span class="percentage">33%</span>
												<div class="clearfix"></div>	
											</div>
										   <div class="progress progress-striped active">
												 <div class="bar red" style="width: 33%;"></div>
											</div>
										</a></li>
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">Issues fixed</span><span class="percentage">80%</span>
											   <div class="clearfix"></div>	
											</div>
											<div class="progress progress-striped active">
												 <div class="bar  blue" style="width: 80%;"></div>
											</div>
										</a></li>
										<li>
											<div class="notification_bottom">
												<a href="#">See all pending task</a>
											</div> 
										</li>
									</ul>
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
											<li class="active"> create User</li>
										</ol>
									   </div>
								  <!--//sub-heard-part-->
									<div class="graph-visual tables-main">
										
												<div class="graph">
														 <div class="block-page">
														



                                                                         <div class="set-1">
																			<div class="graph-2 general">
																				<h3 class="inner-tittle two">Insert profile Id for showing patient history</h3>
																					<div class="grid-1">
																							<div class="form-body">
																									<form class="form-horizontal"  action="showGeneratedPatientHistory" method="GET">
																										<div class="form-group">
																											<label for="focusedinput" class="col-sm-2 control-label">Profile Id</label>
																											<div class="col-sm-8">
																												<input type="text" class="form-control1" name="id" placeholder="Default Input">
																											</div>
																											<div class="col-sm-2">
																												<p class="help-block">erro displaying place</p>
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
									  <a href="doctorIndex"><span class=" name-caret">hospital admin</span></a>
									 <p>System Administrator in NWEHR</p>
									<ul>
									<li><a class="tooltips" href="doctorIndex"><span>Profile</span><i class="lnr lnr-user"></i></a></li>
										<li><a class="tooltips" href="doctorIndex"><span>Settings</span><i class="lnr lnr-cog"></i></a></li>
										<li><a class="tooltips" href="doctorIndex"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
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