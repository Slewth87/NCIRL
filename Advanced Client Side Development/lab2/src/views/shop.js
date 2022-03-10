import { Link } from "react-router-dom";

function Shop() {
    return (
        <div className="App">
            <h1>My shopping list</h1>
            <ul>
                <li>
                    <h2>TV</h2>
                    <h3>LG C1 65" 4K</h3>
                    <a href="https://powercity.ie/product/65C16" target="_blank">Available from Power City</a>
                </li>
                <li>
                    <h2>Console</h2>
                    <h3>Sony PlayStation 5</h3>
                    <a href="https://www.gamestop.ie/PlayStation%205/Games/72504/playstation-5-console" target="_blank">Listed on GameStop</a>
                </li>
                <li>
                    <h2>Sound</h2>
                    <h3>Denon DHTS-517</h3>
                    <a href="https://www.currys.ie/ieen/tv-and-home-entertainment/dvd-blu-ray-and-home-cinema/home-cinema-systems-and-sound-bars/denon-dhts-517-wireless-soundbar-with-dolby-atmos-black-10234738-pdt.html" target="_blank">Available from Currys</a>
                </li>
            </ul>
        </div>
    )
}

export default Shop;