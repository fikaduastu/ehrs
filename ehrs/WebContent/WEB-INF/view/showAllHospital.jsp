<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE HTML>
<html>
<head>
<title>Nation Wide Electronic Health Record System</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/resources/css/style1.css" rel='stylesheet' type='text/css' />
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

<script src="${pageContext.request.contextPath}/resources/js/jquery.easydropdown.js"></script>

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
                    <div class="main-search">
                      <form>
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
                             <div id="dd" class="wrapper-dropdown-3" tabindex="1">
                                      <span>English</span>
                                      <ul class="dropdown">
                                        <li><a class="amaharic">Amaharic</a></li>
                                        <li><a class="oromifa">Oromifa</a></li>
                                        <li><a class="Tigiregna">Tigiregna</a></li>
                                        
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

Girma'ye, [09.07.19 02:06]
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

Girma'ye, [09.07.19 02:06]
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
            <li class="dropdown note">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-tasks"></i> <span class="badge blue1">9</span></a>
                    <ul class="dropdown-menu two">
                    <li>
                      <div class="notification_header">
                        <h3>You have 9 pending task</h3>
                      </div>
                    </li>
                    
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
              <!--//outer-wp-->
                <div class="outter-wp">
                      <!--/sub-heard-part-->
                       <div class="sub-heard-part">
                             <ol class="breadcrumb m-b-0">
                              <li><a href="index.html">Home</a></li>
                              <li class="active">Forms</li>
                            </ol>
                      </div>  
                      <!--/sub-heard-part-->  
                        <!--/forms-->
                          <div class="forms-main">
                            <h2 class="inner-tittle">Add User</h2>
                              <div class="graph-form">
                                  <div id="wropper">
    <div id="header1">
<h2>Show Hospitals List Down</h2>
    </div>
</div>
<div id="container1">
    <div id="content1">
    <!-- add put html table her -->
     <table>
      <tr>
         <th>First name</th>
         <th>Last name</th>
         <th>Email</th>
         <th>Phone number</th>
         <th>Website</th>
         <th>Type</th>
         <th>Woreda Id</th>
      </tr>
<!-- Loop over and print our customer -->
     <c:forEach var="healthCenter" items="${healthCenter}">
     					<c:url var="updateLink" value="/admin/updateHealthCenter">
						<c:param name="id" value="${healthCenter.id}" />
					</c:url>
            <tr>
                <td> ${healthCenter.fistName} </td>
                <td> ${healthCenter.lastName} </td>
                <td> ${healthCenter.email} </td>
                <td> ${healthCenter.phoneNumber} </td>
                <td> ${healthCenter.webSit} </td>
                <td> ${healthCenter.type} </td>
                <td> ${healthCenter.woredaId} </td>
						<td> 
								<a href="${updateLink}">Update</a> |
								
						 </td>
            </tr>
     </c:forEach>
    </table>
</div>
</div>
                
                   <!--footer section start-->
                    <footer>
                       <p>&copy 2019 Nation Wide Electronic Health Record System . All Rights Reserved | Design by <a >Astu 5th Year Students.</a></p>
                    </footer>
                  <!--footer section end-->
                </div>
              </div>
        <!--//content-inner-->
      <!--/sidebar-menu-->
        <div class="sidebar-menu">
          <header class="logo">
          <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="index.html"> <span id="logo"> <h1>NWEHR</h1></span> 
            <!--<img id="logo" src="" alt="Logo"/>--> 
          </a> 
          </header>
        <div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
      <!--/down-->
              <div class="down">  
                    <a href="index.html"><img src="images/in10.jpg"></a>
                    <a href="index.html"><span class=" name-caret">Girmaye</span></a>
                   <p>System Administrator in NWEHR</p>
                  <ul>
                  <li><a class="tooltips" href="index.html"><span>Profile</span><i class="lnr lnr-user"></i></a></li>
                    <li><a class="tooltips" href="index.html"><span>Settings</span><i class="lnr lnr-cog"></i></a></li>
                    <li><a class="tooltips" href="index.html"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
                    </ul>
                  </div>
                 <!--//down-->
                                  <div class="menu">
                  <ul id="menu" >
                    <li><a href="index.html"><i class="fa fa-tachometer"></i> <span>Home</span></a></li>
                     <li id="menu-academico" ><a href="add.html"><i class="fa fa-table"></i> <span>Add User</span> <span class="fa fa-angle-right" style="float: right"></span></a>
                       <ul id="menu-academico-sub" >
                      
                      </ul>
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