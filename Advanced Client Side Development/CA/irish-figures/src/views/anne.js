// Primary view for an individual's page. All elements consistent across each individuals page.
// Designed so that if another individual is to be added, a copy can quickly be made of this template and edited with the appropriate data.

import Header from '../components/header';
import portrait from '../images/Anne Bonny.jpeg';
import Books from '../components/books';

function Anne() {
    return (
        <div className="container-fluid">
            <Header header="Anne Bonny" image={portrait} shuffle="anne"/>
            <div className="row justify-content">
                <div className="col-7 mx-auto">
                    <h2>Anne Bonny (circa-1698)</h2>
                    <p>Anne Cormac, aka Anne Bonny, was a notoriously ruthless pirate who pillaged merchant ships in the Caribbean.</p>
                    <p>Born in county Cork, she was the illegitimate daughter of a lawyer and his maid. Her father brought both Anne and her mother to South Carolina to start a new life.</p>
                    <p>Later on, Anne married a seaman named James Bonny and sailed with him to the Bahamas. Here, he made money by telling tales on pirates. But Anne preferred to join them and deserted Bonny for a colourful pirate called Calico Jack.</p>
                    <p>Sailors believed a woman's presence on-board brought bad luck. But Bonny didn’t hide her identity. Only during attacks did she dress like a man, donning a loose tunic, trousers and a cap. She was also equipped with a sword, pistols and sometimes a machete.</p>
                    <p>The British Navy captured their ship when most of the crew was drunk. But Anne and another female pirate, Mary Read, were its fiercest defenders. The whole crew was executed but, being pregnant, Anne and Mary both escaped it.</p>
                    <p>What happened next is disputed. However, many believe Anne returned to South Carolina and lived a long life. Today, her tale is a favourite among children who experience the EPIC exhibition.</p>
                </div>
                <div className="container">
                    <Books query="Anne Bonny"/>
                </div>
            </div>
        </div>
    )
}

export default Anne;