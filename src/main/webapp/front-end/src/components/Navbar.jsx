import React, {Component} from 'react';
import './Navbar.css';
import {FontAwesomeIcon} from '@fortawesome/react-fontawesome';
import {faUserCircle, faSignInAlt, faUserPlus,faTshirt,faSearch,faShoppingCart,faPhoneSquareAlt} from '@fortawesome/free-solid-svg-icons';

class Navbar extends Component{

    render() {
        return (<React.Fragment>
            <ul className="nav justify-content-center justify-content-lg-end pr-5 nav-style">
                <li className="nav-item">
                    <a className="nav-link text-white ml-5" href="#"><FontAwesomeIcon className="mr-2" icon={faUserPlus}/>SignUp</a>
                </li>
                <li className="nav-item">
                    <a className="nav-link text-white" href="#"><FontAwesomeIcon className="mr-2" icon={faSignInAlt}/>Login</a>
                </li>
                <li className="nav-item">
                    <a className="nav-link text-white ml-5 ml-md-0" href="#"><FontAwesomeIcon className="mr-2" icon={faUserCircle}/>MyAccount</a>
                </li>


            </ul>
            < nav className="navbar justify-content-around flex-column flex-lg-row navbar-expand-lg navbar-light bg-light">
                 <span className="item">



                    <form className="form-inline">
                        <div className="form-group mb-2 ">

                         < a className="navbar-brand mr-0 ml-3"  href="#"><FontAwesomeIcon  icon={faPhoneSquareAlt}/><h5 className="d-inline mb-4">+94 234567891</h5>< /a>

                         </div>
                    </form>
                 </span>

                <span className="item heading pl-5">



                    <form className="form-inline">
                        <div className="form-group mb-2 ">

                            < a className="navbar-brand mr-0 ml-2 ml-lg-0"  href="#"><h1 className="d-inline nav-heading-color ml-4"><FontAwesomeIcon icon={faTshirt}/>  Style Loft</h1> < /a>

                         </div>
                        <div className="input-group mb-2 ml-3">
                            <input type="text" className="form-control"  placeholder="search" />
                            <div className="input-group-append ">
                             <button className="btn btn-dark">Search</button>
                             </div>
                        </div>

                    </form>

</span>
                <span className="item pl-4 mt-3 mr-2 mt-lg-0 mr-lg-0">
                <a className="btn btn-light p-0  " href="#" role="button"><FontAwesomeIcon className="fa-2x" icon={faShoppingCart}/></a>
                <span >Shopping Cart</span></span>


            </nav>
            <nav className="navbar navbar-expand-lg navbar-light bg-light">

                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                        aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse justify-content-center pr-5 navbar-collapse" id="navbarNavDropdown">
                    <ul className="navbar-nav">
                        <li className="nav-item active">
                            <a className="nav-link" href="#">Home <span className="sr-only">(current)</span></a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">Promotions</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">About</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">Contact</a>
                        </li>
                        <li className="nav-item dropdown">
                            <a className="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Categories
                            </a>
                            <div className="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <a className="dropdown-item" href="#">Category1</a>
                                <a className="dropdown-item" href="#">Category2</a>
                                <a className="dropdown-item" href="#">Category3</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>


        </React.Fragment>


    );
    }
    }
    export default Navbar;