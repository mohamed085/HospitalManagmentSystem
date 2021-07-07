<header>
    <div class="uni-medicare-header sticky-menu">
        <div class="container">
            <div class="uni-medicare-header-main">
                <div class="row">
                    <div class="col-md-2">
                        <!--LOGO-->
                        <div class="wrapper-logo">
                            <a class="logo-default" href="<%=request.getContextPath()%>"><img src="././assets/images/logo.png" alt="" class="img-responsive"></a>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                    <div class="col-md-10">
                        <!--MENU TEXT-->
                        <div class="uni-main-menu">
                            <nav class="main-navigation uni-menu-text">
                                <div class="cssmenu">
                                    <ul>
                                        <li>
                                            <a href="<%=request.getContextPath()%>/">Home</a>
                                        </li>
                                        <li>
                                            <a href="<%=request.getContextPath()%>/about">About</a>
                                        </li>
                                        <li>
                                            <a href="<%=request.getContextPath()%>/doctors">Doctors </a>
                                        </li>
                                        <li>
                                            <a href="<%=request.getContextPath()%>/contact">Contact</a>
                                        </li>
                                        <li>
                                            <a href="<%=request.getContextPath()%>/services">Services</a>
                                        </li>
                                        <li class="has-sub">
                                            <a href="Services">Departments</a>
                                            <ul>
                                                <li><a href="">Shop</a></li>
                                                <li><a href="">Single Product</a></li>
                                                <li><a href="">Cart</a></li>
                                                <li><a href="">Checkout</a></li>
                                            </ul>
                                        </li>
                                        <li class="has-sub"><a href='#'>shop</a>
                                            <ul>
                                                <li><a href="">Shop</a></li>
                                                <li><a href="">Cart</a></li>
                                                <li><a href="">Checkout</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>

                        <!--SEARCH AND APPOINTMENT-->
                        <div class="uni-search-appointment">
                            <ul>
                                <li class="un-btn-search">
                                    <i class="fa fa-search" aria-hidden="true"></i>
                                </li>
                                <li class="uni-btn-appointment">
                                    <a href="<%=request.getContextPath()%>/appointment">Appointment</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>  
                <!--FORM SEARCH-->
                <div class="uni-form-search-header">
                    <div class="box-search-header collapse" id="box-search-header">
                        <div class="uni-input-group">
                            <input type="text" name="key" placeholder="Search" class="form-control">
                            <button class="uni-btn btn-search">
                                <i class="fa fa-long-arrow-right" aria-hidden="true"></i>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>