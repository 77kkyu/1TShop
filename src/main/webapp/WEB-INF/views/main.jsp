<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>mainPage</title>
	<!-- App favicon -->
    <link rel="shortcut icon" href="../assets/images/favicon.ico">

	<!-- App css -->
	<link href="../resources/static/assets/css/modern/app-modern.min.css" rel="stylesheet" type="text/css" id="app-default-stylesheet" />
</head>
<style>
img {
	width: 210px;
	height: 210px;
	display: inline-block;
	margin: 30px;
}
</style>
<body>
    <div class="content-page">
        <div class="content">
	
            <!-- Start Content--> <!-- 1, 5, 10 마다 " style="margin-left: 105px;" -->
            <div class="container-fluid">
                <h3 style="margin-left: 575px;">WEEKLY BEST</h3>
	                <div class="row">
                		<c:forEach var="items" items="${list}">
		                    <div class="col-sm-2">
		                        <div class="card product-box">
		                            <div class="product-img">
		                                <div class="p-3">
		                                	<a href="/shop/items/detail/${items.item_No}"></a>
		                                    <img src="../resources/static/assets/images/products/${items.item_Image }" class="img-fluid" style=""/>
		                                </div>
		                                <div class="product-action">
		                                    <div class="d-flex">
		                                        <a href="javascript: void(0);" class="btn btn-white d-block w-100 action-btn m-2"><i class="ri-edit-2-fill align-middle"></i> Edit</a>
		                                        <a href="javascript: void(0);" class="btn btn-white d-block w-100 action-btn m-2"><i class="ri-delete-bin-fill align-middle"></i> Delete</a>
		                                    </div>
		                                </div>
		                            </div> 
		                            <div class="product-info border-top p-3">
	                                <div>
	                                    <h5 class="font-16 mt-0 mb-1">
	                                   		<a href="/shop/items/detail/${items.item_No}" class="text-dark">${items.item_Name}</a> 
	                                    </h5>
	                                    <h4 class="m-0"> <span class="text-muted"> Price : <fmt:formatNumber value="${items.item_Price}" pattern="###,###,###"/></span></h4>
	                                </div>
	                            </div> <!-- end product info-->
		                        </div>
		                    </div>
                		</c:forEach>
	                </div>
                <!-- end row -->
				<!-- 페이징 
                <div class="row">
                    <div class="col-12">
                        <ul class="pagination pagination-rounded justify-content-end mb-3">
                            <li class="page-item">
                                <a class="page-link" href="javascript: void(0);" aria-label="Previous">
                                    <span aria-hidden="true">«</span>
                                </a>
                            </li>
                            <li class="page-item active"><a class="page-link" href="javascript: void(0);">1</a></li>
                            <li class="page-item"><a class="page-link" href="javascript: void(0);">2</a></li>
                            <li class="page-item"><a class="page-link" href="javascript: void(0);">3</a></li>
                            <li class="page-item"><a class="page-link" href="javascript: void(0);">4</a></li>
                            <li class="page-item"><a class="page-link" href="javascript: void(0);">5</a></li>
                            <li class="page-item">
                                <a class="page-link" href="javascript: void(0);" aria-label="Next">
                                    <span aria-hidden="true">»</span>
                                </a>
                            </li>
                        </ul>
                    </div> <!-- end col
                </div> -->
                <!-- end row-->
                
            </div> <!-- container -->

        </div> <!-- content -->
		
    </div>

    <!-- ============================================================== -->
    <!-- End Page content -->
    <!-- ============================================================== -->
</body>
</html>