<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE HTML>
<html>
<head>
<title>Nation Wide Electronic Health Record System</title>


<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="icon" href="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/favicon.png" type="image/png">
	<title>Medicare Medical</title>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css1/bootstrap.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors1/linericon/style.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css1/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors1/owl-carousel/owl.carousel.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors1/lightbox/simpleLightbox.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors1/nice-select/css/nice-select.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors1/animate-css/animate.css">
	<!-- main css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css1/style.css">




<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/amcharts.js"></script>	
<script src="${pageContext.request.contextPath}/resources/js/serial.js"></script>	
<script src="${pageContext.request.contextPath}/resources/js/light.js"></script>	
<script src="${pageContext.request.contextPath}/resources/js/radar.js"></script>	
<link href="${pageContext.request.contextPath}/resources/css/barChart.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath}/resources/css/fabochart.css" rel='stylesheet' type='text/css' />
<!--clock init-->
<script src="${pageContext.request.contextPath}/resources/js/css3clock.js"></script>
<!--Easy Pie Chart-->
<!--skycons-icons-->
<script src="${pageContext.request.contextPath}/resources/js/skycons.js"></script>

<script src="js/jquery.easydropdown.js"></script>

<!--//skycons-icons-->
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
						       
								
							<!--/profile_details-->
								<div class="profile_details_left">
									<ul class="nofitications-dropdown">
											<li class="dropdown note dra-down">
													   <div id="dd" class="wrapper-dropdown-3" tabindex="1">
																			<span>English</span>
																			<ul class="dropdown">
																				<li><a class="amaharic">Amaharic</a></li>
																				<li><a class="oromifa">Oromifa</a></li>
																				<li><a class="tigiregna">Tigiregna</a></li>
																			</ul>
																		</div>
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
										
										 <li>
											<div class="notification_bottom">
												<a href="#">See all notification</a>
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
						<div class="outter-wp">
								<!--custom-widgets-->
												
 



	<!--================ Start Header Menu Area =================-->
	
	<!--================ End Header Menu Area =================-->


	<!--================ End Features Area =================-->
									<div class="graph-visual tables-main">
										
												<div class="graph">
														 <div class="block-page">
														



                                                                         <div class="set-1">
																			<div class="graph-2 general">
																				<h3 class="inner-tittle two">Create regional admin </h3>
																					<div class="grid-1">
																							<div class="form-body">
																									<form:form class="form-horizontal" modelAttribute="admins" action="addAdmin" method="GET">
																									
																									<form:hidden path="id"/>
																										<div class="form-group">
																											<label for="focusedinput" class="col-sm-2 control-label">User Name</label>
																											<div class="col-sm-8">
																												<form:input type="text"  path ="userName" class="form-control1" name="userName" placeholder="Default Input" />
																											</div>
																											<div class="col-sm-2">
																												<p class="help-block">erro displaying place</p>
																											</div>
																										</div>

																									<div class="form-group">
																										<label class="col-md-2 control-label">Password</label>
																										<div class="col-md-8">
																											<div class="input-group">
																												<span class="input-group-addon">
																													<i class="fa fa-key"></i>
																												</span>
																												<form:input type="password" path ="password" class="form-control1 icon" name="password" placeholder="Password" />
																											</div>
																										</div>
																										<div class="col-sm-2">
																												<p class="help-block">erro displaying place</p>
																											</div>
																											</div>
																									<div class="form-group">
																										<label class="col-md-2 control-label">Email Address</label>
																										<div class="col-md-8">
																											<div class="input-group">							
																												<span class="input-group-addon">
																													<i class="fa fa-envelope-o"></i>
																												</span>
																												<form:input type="text"  path="email" name="email" class="form-control1 icon" placeholder="Email Address" />
																											</div>
																										</div>
																										<div class="col-sm-2">
																												<p class="help-block">erro displaying place</p>
																											</div>
																									</div>
																										<div class="form-group">
																											<label for="selector1" class="col-sm-2 control-label">Status</label>
																												<div class="col-sm-8"><form:select path="region" name="region" id="region" class="form-control1" >
																												<form:option value="ADDIS ABABA ADMINISTRATION" />
																												<form:option value="DIRE DAWA ADMINISTRATION" />
																												<form:option value="SNNPR" />
																												<form:option value="OROMIYA" />
																												<form:option value="AMHARA" />
																												<form:option value="TIGRAY" />
																												<form:option value="GAMBELA" />
																												<form:option value="HARARE" />
																												<form:option value="AFAR" />
																												<form:option value="BENISHANGUL GUMUZ" />
																												<form:option value="SOMALI" />
																												</form:select></div>
																											<div class="col-sm-2">
																											<p class="help-block">erro displaying place</p>
																											</div>
																										</div>
										
																										

																						<div class="form-group button-2">
																						  <button type="submit" class="btn btn-primary">Submit</button>
																						  <button type="reset" class="btn btn-default">Reset</button>
																						</div>




																									</form:form>
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
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="${pageContext.request.contextPath}/resources/js1/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js1/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js1/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js1/stellar.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendors1/lightbox/simpleLightbox.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendors1/nice-select/js/jquery.nice-select.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendors1/owl-carousel/owl.carousel.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js1/jquery.ajaxchimp.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendors1/counter-up/jquery.waypoints.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendors1/counter-up/jquery.counterup.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js1/mail-script.js"></script>
	<!--gmaps Js-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="${pageContext.request.contextPath}/resources/js1/gmaps.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js1/theme.js"></script>








													
																								
						</div>						
					
				<!--//content-inner-->
			<!--/sidebar-menu-->
				<div class="sidebar-menu">
					<header class="logo">
					<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="federalAdminIndex"> <span id="logo"> <h1>NWEHR</h1></span> 
					<!--<img id="logo" src="" alt="Logo"/>--> 
				  </a> 
				</header>
			<div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
			<!--/down-->
							<div class="down">	
									  <a href="federalAdminIndex"><img src="${pageContext.request.contextPath}/resources/images/in10.jpg"></a>
									  <a href="federalAdminIndex"><span class=" name-caret">Federal System admin</span></a>
									 <p>System Administrator in NWEHR</p>
									<ul>
									<li><a class="tooltips" href="federalAdminIndex"><span>Profile</span><i class="lnr lnr-user"></i></a></li>
										<li><a class="tooltips" href="federalAdminIndex"><span>Settings</span><i class="lnr lnr-cog"></i></a></li>
										<li><a class="tooltips" href="federalAdminIndex"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
										</ul>
									</div>
							   <!--//down-->
                           <div class="menu">
									<ul id="menu" >
										<li><a href="federalAdminIndex"><i class="fa fa-tachometer"></i> <span>Home</span></a></li>
										 <li id="menu-academico" ><a href="createRegionalAdmin"><i class="fa fa-table"></i> <span>Create Regional Admin</span> <span class="" style="float: right"></span></a>
										   <ul id="menu-academico-sub" >
											
										  </ul>
										</li>
										 <li id="menu-academico" ><a href="showAllRegionalAdmins"><i class="fa fa-file-text-o"></i> <span>Show All Regional Admins</span> <span class="" style="float: right"></span></a>
											 
										 </li>
									
									
									
								 
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/vroom.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/vroom.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/TweenLite.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/CSSPlugin.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>

<!-- Bootstrap Core JavaScript -->
   <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>