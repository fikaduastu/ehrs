<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE HTML>
<html>
<head>
<title>Electronic Health Record System</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Augment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style1.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />

<link href="${pageContext.request.contextPath}/resources/css/style.css" rel='stylesheet' type='text/css' />

<link href="${pageContext.request.contextPath}/resources/css/font-awesome.css" rel="stylesheet"> 

<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/icon-font.min.css" type='text/css' />

<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script>

<style type="text/css">
    body {
        color: #404E67;
        background: #F5F7FA;
		font-family: 'Open Sans', sans-serif;
	}
	.table-wrapper {
		width: 1100px;
		margin: 30px auto;
        background: #fff;
        padding: 20px;	
        box-shadow: 0 1px 1px rgba(0,0,0,.05);
    }
    .table-title {
        padding-bottom: 10px;
        margin: 0 0 10px;
    }
    .table-title h2 {
        margin: 6px 0 0;
        font-size: 22px;
    }
    .table-title .add-new {
        float: right;
		height: 30px;
		font-weight: bold;
		font-size: 12px;
		text-shadow: none;
		min-width: 100px;
		border-radius: 50px;
		line-height: 13px;
    }
	.table-title .add-new i {
		margin-right: 4px;
	}
    table.table {
        table-layout: fixed;
    }
    table.table tr th, table.table tr td {
        border-color: #e9e9e9;
    }
    table.table th i {
        font-size: 13px;
        margin: 0 5px;
        cursor: pointer;
    }
    table.table th:last-child {
        width: 100px;
    }
    table.table td a {
		cursor: pointer;
        display: inline-block;
        margin: 0 5px;
		min-width: 24px;
    }    
	table.table td a.add {
        color: #27C46B;
    }
    table.table td a.edit {
        color: #FFC107;
    }
    table.table td a.delete {
        color: #E34724;
    }
    table.table td i {
        font-size: 19px;
    }
	table.table td a.add i {
        font-size: 24px;
    	margin-right: -1px;
        position: relative;
        top: 3px;
    }    
    table.table .form-control {
        height: 32px;
        line-height: 32px;
        box-shadow: none;
        border-radius: 2px;
    }
	table.table .form-control.error {
		border-color: #f50000;
	}
	table.table td .add {
		display: none;
	}
</style>
</head> 
<body>
   <div class="page-container">
	<div class="left-content">
	   <div class="inner-content">
			<div class="header-section">
						<div class="top_menu">
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
							
						</div>
						
					<div class="clearfix"></div>
				</div>
					
							<div class="outter-wp">
									
									  <div class="sub-heard-part">
									    <ol class="breadcrumb m-b-0">
                      <li><a href="doctorIndex">Home</a></li>
                      <li class="active">Show all regional admins</li>
                    </ol>
									   </div>
								  
									<script type="text/javascript">
$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
	var actions = $("table td:last-child").html();
	// Append table with add row form on add new button click
    $(".add-new").click(function(){
		$(this).attr("disabled", "disabled");
		var index = $("table tbody tr:last-child").index(); 
						
        var row = '<tr>' +
            '<td><input type="text" class="form-control" name="FirstName" id="fname"></td>' + '<td><input type="Email" class="form-control" name="Email" id="Email"></td>' + '<td><input type="Password" class="form-control" name="Password" id="password"></td>' +'<td><input type="text" class="form-control" name="position" id="position"></td>'+
            '<td><input type="text" class="form-control" name="Type" id="type"></td>' + '<td><input type="text" class="form-control" name="regional" id="regional"></td>' +
			'<td>' + actions + '</td>' +
        '</tr>';
    	$("table").append(row);		
		$("table tbody tr").eq(index + 1).find(".add, .edit").toggle();
        $('[data-toggle="tooltip"]').tooltip();
    });
	// Add row on add button click
	$(document).on("click", ".add", function(){
        var empty = false;
        var input = $(this).parents("tr").find('input[type="text"]');
        input.each(function(){
            if(!$(this).val()){
                $(this).addClass("error");
                empty = true;
            } else{
                $(this).removeClass("error");
            }
        });
        $(this).parents("tr").find(".error").first().focus();
        if(!empty){
            input.each(function(){
                $(this).parent("td").html($(this).val());
            });         
            $(this).parents("tr").find(".add, .edit").toggle();
            $(".add-new").removeAttr("disabled");
        }       
    });
	// Edit row on edit button click
	$(document).on("click", ".edit", function(){		
        $(this).parents("tr").find("td:not(:last-child)").each(function(){
			$(this).html('<input type="text" class="form-control" value="' + $(this).text() + '">');
		});		
		$(this).parents("tr").find(".add, .edit").toggle();
		$(".add-new").attr("disabled", "disabled");
    });
	// Delete row on delete button click
	$(document).on("click", ".delete", function(){
        $(this).parents("tr").remove();
		$(".add-new").removeAttr("disabled");
    });
});
</script>
</head>
<body>

	<% session.getAttribute("name"); %>
 
					<h5 style="align:center">Medical Certificate</h5>
				<label>I the Designed doctor :    </label><% String name = (String) session.getAttribute("name");  out.print(name);%>     <label> certify that</label> 
				<br><label>the examination of Mr/Ms :</label><% String patient = (String) session.getAttribute("patient");  out.print(patient);%>
				<br><label>	date of birth :</label><% String dob = (String) session.getAttribute("dob");  out.print(dob);%>
		
				<br><label>	reveals no contradiction for participating in 
					running compitition.</label>
				<label>medical certificate is issued in :</label><%= (new java.util.Date()).toLocaleString()%>
				<%-- <label> hospital name :</label><% String org = (String) session.getAttribute("org");  out.print(org);%> --%>
                         
														  
										    </div>
										</div>
									</div>
								
										<footer>
										   <p>&copy 2020 Electronic Health Record System . All Rights Reserved </p>
										</footer>
									
								</div>
							</div>
				
			
				<div class="sidebar-menu">
					<header class="logo">
					<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="doctorIndex"> <span id="logo"> <h1>EHRs</h1></span> 
					
				  </a> 
				</header>
			<div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
				<div class="sidebar-menu">
					<header class="logo">
					<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="doctorIndex"> <span id="logo"> <h1>NWEHR</h1></span> 
					
				  </a> 
				</header>
			<div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
			
							<div class="down">	
									  <a href="doctorIndex"><img src="${pageContext.request.contextPath}/resources/images/in10.jpg"></a>
									  <a href="doctorIndex"><span class=" name-caret">Federal System admin</span></a>
									 <p>System Administrator in NWEHR</p>
									<ul>
										<li><a class="tooltips" href="logout"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
									</ul>
									</div>
							  


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
								</div>
							  </div>
							  <div class="clearfix"></div>		
							</div>
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

	<script src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>

   <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>