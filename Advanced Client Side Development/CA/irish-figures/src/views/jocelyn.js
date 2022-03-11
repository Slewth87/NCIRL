// Primary view for an individual's page. All elements consistent across each individual page.
// Designed so that if another individual is to be added, a copy can quickly be made of this template and edited with the appropriate data.

import Header from '../components/header';
import portrait from '../images/Dame Jocelyn Bell Burnell.jpeg';
import Books from '../components/books';

function Jocelyn() {
    return (
        <div className="container-fluid">
            <Header header="Dame Jocelyn Bell Burnell" image={portrait} shuffle="jocelyn"/>
            <div className="row justify-content">
                <div className="col-7 mx-auto">
                    <h2>Dame Jocelyn Bell Burnell (1943-present)</h2>
                    <p>As an astrophysicist, Jocelyn Bell Burnell, is best known for her discovery of the first radio pulsars while still a student.</p>
                    <p>Born in Belfast, Bell’s father was an architect for the Armagh Observatory. The time she spent there as a child ignited her interest in astronomy. The observatory’s staff encouraged her interest too and she went on to study physics.</p>
                    <p>In 1969, while at the University of Cambridge, Bell helped to construct an 81.5 megahertz radio telescope. It covered enough land to fit 57 tennis courts and looked like a field of wire fencing!</p>
                    <p>She was the first person to run the telescope, which churned out miles of paper readings every day. She quickly noticed some strange squiggles. . .</p>
                    <p>Even her thesis supervisor didn’t know what they were. Initially, he thought they were artificial signals and labelled them ‘LGM-1’ - which stood for ‘Little Green Men’. But as it turned out they came from rapidly-rotating, city-sized collapsed stars.</p>
                    <p>The discovery led to many other scientific developments and even allowed astronomers to make a map to direct aliens toward Earth.</p>
                </div>
                <div className="container">
                    <Books query="Jocelyn Bell Burnell"/>
                </div>
            </div>
        </div>
    )
}

export default Jocelyn;