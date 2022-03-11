import { Link } from "react-router-dom";
import logo from '../images/logo64.png';

function Navbar() {
    return (
        <nav className="navbar navbar-expand-md fixed-top navbar-dark bg-dark">
          <div className="container-fluid">
            <a className="headline d-flex align-center"><img src={logo} alt="Irish Historical Figures" height="45"/><h3 className="px-1 mt-1">Irish Historical Figures</h3></a>
            <ul className="navbar-nav">
              <li className="nav-item">
                <Link to="/" className="nav-link">Home</Link>
              </li>
              <li className="nav-item">
                <Link to="/bram" className="nav-link">Bram Stoker</Link>
              </li>
              <li className="nav-item">
                <Link to="/anne" className="nav-link">Anne Bonny</Link>
              </li>
              <li className="nav-item">
                <Link to="/charles" className="nav-link">Sir Charles Parsons</Link>
              </li>
              <li className="nav-item">
                <Link to="/jocelyn" className="nav-link">Dame Jocelyn Bell Burnell</Link>
              </li>
              <li className="nav-item">
                <Link to="/ernest" className="nav-link">Ernest Shackleton</Link>
              </li>
            </ul>
            </div>
        </nav>
    )
}

export default Navbar;