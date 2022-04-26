<div class="container mt-5">
        <div class="row">
            <div class="col header-title">
                <h1>Student Management System</h1>
            </div>
        </div>
    </div>
    <div class="container mt-5 login-modal">
        <div class="row">
            <div class="col-sm-8">
                <div class="panel-img">
                    <img src="public\img\nuist.jpg" alt="">
                </div>
            </div>
            <div class="col-sm-4 panel-container">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Login</h3>
                    </div>                    
                    <div class="panel-body mt-2">
                        <form role="form" action="Login" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <i class='bx bx-user'></i>
                                    <input class="form-control" placeholder="Username" name="username" type="text" autofocus required>
                                </div>
                                <div class="form-group mt-2">
                                    <i class='bx bxs-lock-alt'></i>
                                    <input class="form-control" placeholder="Password" name="password" type="password" required>
                                </div>                                                                
                                <div class="checkbox remember-me mt-2">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me"> Remember Me
                                    </label>
                                </div>
                                                                
                                <div class="login-btn-container">
                                    <button type="submit" class="btn btn-lg btn-primary btn-block">Login</button>
                                    <a href="#" type="submit" class="btn btn-lg btn-light btn-block">Reset</a>
                                    <a href="#" type="submit" class="btn btn-lg btn-light btn-block">Register</a>                                
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>    