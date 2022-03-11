// Implementation for Navbar elements from `react-bootstrap`

import { Link } from "react-router-dom";
import logo from '../images/logo64.png';
import Navbar from 'react-bootstrap/Navbar';
import Container from 'react-bootstrap/Container';
import Offcanvas from 'react-bootstrap/Offcanvas';
import Nav from 'react-bootstrap/Nav';

function MyNavbar() {
    return (
      <Navbar bg="dark" variant="dark" expand="md">
        <Container fluid>
          {/* Setting a linkable logo and title in the navbar */}
          <Link to="/" className="navbar-brand headline d-flex align-center nav-linker"><img src={logo} alt="Irish Historical Figures" height="45"/><h3 className="px-1 mt-1 text-light">Irish Historical Figures</h3></Link>
          {/* Allowing for a collapsible navigation menu for narrower screens */}
          <Navbar.Toggle aria-controls="offcanvasNavbar" />
          <Navbar.Collapse id="offcanvasNavbar" >
            {/* Navigation options for the uncollapsed, wide screen version */}
            <Nav className="justify-content-end flex-grow-1 pe-3">
              <Nav.Link href="/">Home</Nav.Link>
              <Nav.Link href="/bram">Bram Stoker</Nav.Link>
              <Nav.Link href="/anne">Anne Bonny</Nav.Link>
              <Nav.Link href="/charles">Sir Charles Parsons</Nav.Link>
              <Nav.Link href="jocelyn">Dame Jocelyn Bell Burnell</Nav.Link>
              <Nav.Link href="ernest">Ernest Shackleton</Nav.Link>
            </Nav>
            {/* OffCanvas feature which will open when the navigation button is clicked on narrower screens */}
            <Navbar.Offcanvas id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel" placement="end" className="bg-dark navbar-dark">
              <Offcanvas.Header closeButton closeVariant="white" className="text-light">
                <Offcanvas.Title id="offcanvasNavbarLabel"><img src={logo} alt="Irish Historical Figures" height="45"/>  Irish Historical Figures</Offcanvas.Title>
              </Offcanvas.Header>
              <Offcanvas.Body>
                <Nav className="justify-content-end flex-grow-1 pe-3">
                  <Nav.Link href="/">Home</Nav.Link>
                  <Nav.Link href="/bram">Bram Stoker</Nav.Link>
                  <Nav.Link href="/anne">Anne Bonny</Nav.Link>
                  <Nav.Link href="/charles">Sir Charles Parsons</Nav.Link>
                  <Nav.Link href="jocelyn">Dame Jocelyn Bell Burnell</Nav.Link>
                  <Nav.Link href="ernest">Ernest Shackleton</Nav.Link>
                </Nav>
              </Offcanvas.Body>
            </Navbar.Offcanvas>
           </Navbar.Collapse>
        </Container>
      </Navbar>
    )
}

export default MyNavbar;