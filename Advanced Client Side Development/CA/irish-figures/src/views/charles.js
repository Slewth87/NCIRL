// Primary view for an individual's page. All elements consistent across each individuals page.
// Designed so that if another individual is to be added, a copy can quickly be made of this template and edited with the appropriate data.

import Header from '../components/header';
import portrait from '../images/Sir Charles Parsons.jpeg';
import Books from '../components/books';

function Charles() {
    return (
        <div className="container-fluid">
            <Header header="Sir Charles Parsons" image={portrait} shuffle="charles"/>
            <div className="row justify-content">
                <div className="col-7 mx-auto">
                    <h2>Sir Charles Parsons (1854-1931)</h2>
                    <p>Charles Parsons was the son of the peer of Offaly, the Earl of Rosse, who was a famous astronomer and builder of the "Leviathan", which was at that time, the largest telescope in the world. It can still be visited at their family home at Birr Castle.</p>
                    <p>Charles invented the steam turbine. It was highly efficient and could be harnessed directly to generate electricity. As a result of his invention, widespread and cheap electricity became possible and ushered in the modern electric world.</p>
                    <p>He also designed a turbine-powered yacht, the Turbina which was exhibited at Queen Victoria's Diamond Jubilee and was at the time the fastest ship in the Royal Navy. Parson's turbine engines would also be used to power the famous HMS Dreadnought, the first modern battleship.</p>
                    <p>An engineering company he established in Newcastle still exists today nearly 90 years after his death and is now a subsidiary of Siemens, the German conglomerate. Parsons was made a Fellow of the Royal Society in the United Kingdom and knighted for his contributions to science.</p>
                </div>
                <div className="container">
                    <Books query="Charles Parsons"/>
                </div>
            </div>
        </div>
    )
}

export default Charles;