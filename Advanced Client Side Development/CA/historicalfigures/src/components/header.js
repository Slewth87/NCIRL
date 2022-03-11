function Header(props) {
    return (
        <header className="row banner">
            <div className="col p-0">
                <img className="img-fluid w-100" id={props.shuffle} src={props.image}/>
                <h1 className="d-block overlay">{props.header}</h1>
            </div>
        </header>
    )
}

export default Header;