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

	<!--================ Start Home Banner Area =================-->
	<section class="home_banner_area">
		<div class="banner_inner">
			<div class="container">
				<div class="banner_content">
					<h2>
						We Will Hold Your Health   <br>
						Record Wherever <br>
						You Go <br>
					</h2>
					<p>
						The art of medicine consists of amusing the patient while nature cures the disease.
					</p>
					<a class="primary-btn text-uppercase" href="#">Learn More</a>
				</div>
			</div>
		</div>
	</section>
	<!--================ End Home Banner Area =================-->

	<!--================ Start Features Area =================-->
	<section class="features_area section_gap">
		<div class="container">
			<div class="row">
				<!-- single feature -->
				<div class="col-lg-4 col-md-6">
					<div class="single_feature">
						<div class="feature_head">
							<img src="${pageContext.request.contextPath}/resources/img/features/icon1.png" alt="">
							<h4>Hospital and reginal admin registration</h4>
						</div>
						<div class="feature_content">
							<p>There are two adminstrator in our system.The first one is the federal admin and the second one is the reginal admin.</p>
							<div class="feature_btn">
								<a href="#" class="f_btn">Call Us: 215 - 3695 - 9584</a>
							</div>
						</div>
					</div>
				</div>
				<!-- single feature -->
				<div class="col-lg-4 col-md-6">
					<div class="single_feature">
						<div class="feature_head">
							<img src="${pageContext.request.contextPath}/resources/img/features/icon2.png" alt="">
							<h4>Doctors Schedule</h4>
						</div>
						<div class="feature_content">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et
								dolore magna aliqua. Ut enim ad minim veniam.</p>
							<div class="feature_btn">
								<a href="#" class="f_btn">Learn More</a>
							</div>
						</div>
					</div>
				</div>
				<!-- single feature -->
				<div class="col-lg-4 col-md-6">
					<div class="single_feature">
						<div class="feature_head">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/features/icon3.png" alt="">
							<h4>Online Appointment</h4>
						</div>
						<div class="feature_content">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et
								dolore magna aliqua. Ut enim ad minim veniam.</p>
							<div class="feature_btn">
								<a href="#" class="f_btn">Get Appointment</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ End Features Area =================-->

	<!--================ Start About Area =================-->
	<section class="about_area lite_bg">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-5 col-md-5">
					<div class="about_details lite_bg">
						<h2>Welcome to Medicare Center</h2>
						<p>inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards
							especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.</p>
						<ul class="list_wrap">
							<li class="about_lists">Women face higher conduct standards especially in the workplace that’s why it’s crucial
								that.</li>
							<li class="about_lists">Women face higher conduct standards especially in the workplace that’s why it’s crucial
								that.</li>
							<li class="about_lists">Women face higher conduct standards especially in the workplace that’s why it’s crucial
								that.</li>
						</ul>
					</div>
				</div>
				<div class="col-lg-4 offset-lg-3 col-md-6 offset-md-1">
					<div class="about_right overlay">
						<div class="about_inner">
							<h4>Doctors Time table</h4>
							<p>Mon to Friday -- 07.00 AM to 10.00 PM</p>
							<p>Mon to Friday -- 07.00 AM to 10.00 PM</p>
							<p>Mon to Friday -- 07.00 AM to 10.00 PM</p>
							<p>Mon to Friday -- 07.00 AM to 10.00 PM</p>
							<p>Mon to Friday -- 07.00 AM to 10.00 PM</p>
							<p>Mon to Friday -- 07.00 AM to 10.00 PM</p>
						</div>

					</div>
				</div>
			</div>
			<div class="about_bg overlay"></div>
		</div>
	</section>
	<!--================ End About Area =================-->

	<!--================ Start Department Area =================-->
	<section class="department_area section_gap">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-7">
					<div class="main_title">
						<h2>Medicare Popular Departments</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore
							magna aliqua.</p>
					</div>
				</div>
			</div>

			<div class="row">
				<!-- single department -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/department/d-icon1.png" alt="">
						</div>
						<h4>Cardiology</h4>
					</div>
				</div>
				<!-- single department -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/department/d-icon2.png" alt="">
						</div>
						<h4>Urology</h4>
					</div>
				</div>
				<!-- single department -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/department/d-icon3.png" alt="">
						</div>
						<h4>Dental Care</h4>
					</div>
				</div>
				<!-- single department -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/department/d-icon4.png" alt="">
						</div>
						<h4>Eye Care</h4>
					</div>
				</div>
				<!-- single department -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/department/d-icon5.png" alt="">
						</div>
						<h4>Neurology</h4>
					</div>
				</div>
				<!-- single department -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/department/d-icon6.png" alt="">
						</div>
						<h4>Plastic Surgery</h4>
					</div>
				</div>
				<a class="primary-btn text-uppercase" href="#">Learn More</a>
			</div>
		</div>
	</section>
	<!--================ End Department Area =================-->

	<!--================ Start Counter Area =================-->
	<section class="section_gap counter_area overlay">
		<div class="container">
			<div class="row">
				<!--single-counter-->
				<div class="col-lg-3 col-sm-6">
					<div class="single_counter">
						<h1> <span class="counter_number">30</span>K</h1>
						<p>Years <br> of Experiences</p>
					</div>
				</div>
				<!--single-counter-->
				<div class="col-lg-3 col-sm-6">
					<div class="single_counter">
						<h1> <span class="counter_number">2</span>K+</h1>
						<p>Instant <br> Blood Donors </p>
					</div>
				</div>
				<!--single-counter-->
				<div class="col-lg-3 col-sm-6">
					<div class="single_counter">
						<h1> <span class="counter_number">5</span>K+</h1>
						<p>Well Cured <br> Patients</p>
					</div>
				</div>
				<!--single-counter-->
				<div class="col-lg-3 col-sm-6">
					<div class="single_counter">
						<h1> <span class="counter_number">20</span>K+</h1>
						<p>Internal <br> Stuff Groups</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ Start Counter Area =================-->

	<!--================ Start Team Area =================-->
	<section class="section_gap team_area lite_bg">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-7">
					<div class="main_title">
						<h2>Medicare Popular Departments</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore
							magna aliqua.</p>
					</div>
				</div>
			</div>
			<div class="row">
				<!-- single-team-member -->
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/team/member1.png" alt="">
						</div>
						<div class="author_decs">
							<div class="social_icons">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-linkedin"></i></a>
							</div>
							<h4>Ethel Davis</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
				<!-- single-team-member -->
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/img/team/member2.png" alt="">
						</div>
						<div class="author_decs">
							<div class="social_icons">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-linkedin"></i></a>
							</div>
							<h4>Rodney Cooper</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
				<!-- single-team-member -->
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="${pageContext.request.contextPath}/resources/img/team/member3.png" alt="">
						</div>
						<div class="author_decs">
							<div class="social_icons">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-linkedin"></i></a>
							</div>
							<h4>Dane Walker</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
				<!-- single-team-member -->
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="${pageContext.request.contextPath}/resources/img/team/member4.png" alt="">
						</div>
						<div class="author_decs">
							<div class="social_icons">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-linkedin"></i></a>
							</div>
							<h4>Lena Keller</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ End Team Area =================-->

	<!--================ Start Blog Area =================-->
	<section class="section_gap blog_area">
		<div class="container">
			<div class="row">
				<!-- recent blog -->
				<div class="col-lg-6">
					<div class="recent_blog">
						<div class="blog_title">
							<h2>Our Recent Blogs</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et
								dolore magna aliqua.</p>
						</div>
					</div>
					<div class="row">
						<!-- single-blog -->
						<div class="col-lg-12 col-sm-12">
							<div class="single_blog">
								<div class="row align-items-center">
									<div class="col-lg-4 col-md-3">
										<div class="blog_thumb">
											<img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/recent-blog/blog1.jpg" alt="">
										</div>
									</div>
									<div class="col-lg-8 col-md-8">
										<div class="blog_details">
											<div class="blog_meta">
												<span><i class="fa fa-calendar"></i>13th Dec</span>
												<span><i class="fa fa-heart-o"></i>15</span>
												<span><i class="fa fa-comment-o"></i>04</span>
											</div>
											<h4>
												<a href="#">Portable Fashion for women</a>
											</h4>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- single-blog -->
						<div class="col-lg-12 col-sm-12">
							<div class="single_blog">
								<div class="row align-items-center">
									<div class="col-lg-4 col-md-3">
										<div class="blog_thumb">
											<img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/recent-blog/blog2.jpg" alt="">
										</div>
									</div>
									<div class="col-lg-8 col-md-8">
										<div class="blog_details">
											<div class="blog_meta">
												<span><i class="fa fa-calendar"></i>13th Dec</span>
												<span><i class="fa fa-heart-o"></i>15</span>
												<span><i class="fa fa-comment-o"></i>04</span>
											</div>
											<h4>
												<a href="#">Portable Fashion for women</a>
											</h4>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- single-blog -->
						<div class="col-lg-12 col-sm-12">
							<div class="single_blog">
								<div class="row align-items-center">
									<div class="col-lg-4 col-md-3">
										<div class="blog_thumb">
											<img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/recent-blog/blog3.jpg" alt="">
										</div>
									</div>
									<div class="col-lg-8 col-md-8">
										<div class="blog_details">
											<div class="blog_meta">
												<span><i class="fa fa-calendar"></i>13th Dec</span>
												<span><i class="fa fa-heart-o"></i>15</span>
												<span><i class="fa fa-comment-o"></i>04</span>
											</div>
											<h4>
												<a href="#">Portable Fashion for women</a>
											</h4>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- appoinment area -->
				<div class="col-lg-6">
					<div class="recent_blog appoinment">
						<div class="blog_title">
							<h2>Make an Appointment</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et
								dolore magna aliqua.</p>
						</div>
					</div>
					<div class="row justify-content-center">
						<div class="appoinment_form_section lite_bg">
							<form class="form_area" id="myForm" action="mail.html" method="post">
								<div class="row">
									<div class="col-lg-12 form_group">
										<input name="name" placeholder="Patient name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'"
										 class="common_input form-control" required="" type="text">
										<input name="email" placeholder="Email address" pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$"
										 onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'" class="common_input form-control"
										 required="" type="email">
										<input name="name" placeholder="Date of birth" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'"
										 class="common_input form-control" required="" type="text">
										<select class="default-select">
											<option data-display="Doctor’s name">Doctor’s name</option>
											<option value="1">Rashimul</option>
											<option value="2">Shofi</option>
										</select>
										<input name="subject" placeholder="Appointment date" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Subject'"
										 class="common_input mb-10 form-control" required="" type="text">

										<textarea class="common_textarea form-control" name="message" placeholder="Messege" onfocus="this.placeholder = ''"
										 onblur="this.placeholder = 'Messege'" required=""></textarea>
									</div>
									<div class="col-lg-12 text-center">
										<button class="primary-btn text-uppercase">confirm booking</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ End Blog Area =================-->

	<!--================ Start footer Area  =================-->
	
	<!--================ End footer Area  =================-->

	<!-- Optional JavaScript -->
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
					<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="regionalAdminIndex"> <span id="logo"> <h1>NWEHR</h1></span> 
					<!--<img id="logo" src="" alt="Logo"/>--> 
				  </a> 
				</header>
			<div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
			<!--/down-->
							<div class="down">	
									  <a href="regionalAdminIndex"><img src="${pageContext.request.contextPath}/resources/images/in10.jpg"></a>
									  <a href="regionalAdminIndex"><span class=" name-caret">regional system admin</span></a>
									 <p>System Administrator in NWEHR</p>
									<ul>
									<li><a class="tooltips" href="regionalAdminIndex"><span>Profile</span><i class="lnr lnr-user"></i></a></li>
										<li><a class="tooltips" href="regionalAdminIndex"><span>Settings</span><i class="lnr lnr-cog"></i></a></li>
										<li><a class="tooltips" href="regionalAdminIndex"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
										</ul>
									</div>
							   <!--//down-->
                           <div class="menu">
									<ul id="menu" >
										<li><a href="regionalAdminIndex"><i class="fa fa-tachometer"></i> <span>Home</span></a></li>
										 <li id="menu-academico" ><a href="showCreateHospital"><i class="fa fa-table"></i> <span>Create Hospital</span> <span class="" style="float: right"></span></a>
										   <ul id="menu-academico-sub" >
											
										  </ul>
										</li>
										 <li id="menu-academico" ><a href="showCreateHospitalAdmin"><i class="fa fa-file-text-o"></i> <span>Create hospital admin</span> <span class="" style="float: right"></span></a>
											 
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