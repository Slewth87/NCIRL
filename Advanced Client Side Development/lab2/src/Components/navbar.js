import { Link } from "react-router-dom";

function Navbar() {
    return (
        <div style={{padding:'4px',background:'#7d89bd'}}>
            <nav>
                <Link to="/">Home | </Link>
                <Link to="/shop">Shop</Link>
            </nav>
        </div>
    )
}

export default Navbar;