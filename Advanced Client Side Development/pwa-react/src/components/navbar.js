import { Link } from "react-router-dom";

function Navbar() {
    return (
        <div>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                    <Link className="nav-link" to="/">Home</Link>
                    </li>
                    <li class="nav-item">
                    <Link className="nav-link" to="/shop">Shop</Link>
                    </li>
                </ul>
                </div>
            </div>
            </nav>
        </div>




        // <div style={{padding:'4px',background:'#7d89bd'}}>
        //     <nav>
        //         <Link to="/">Home | </Link>
        //         <Link to="/shop">Shop</Link>
        //     </nav>
        // </div>
    )
}

export default Navbar;