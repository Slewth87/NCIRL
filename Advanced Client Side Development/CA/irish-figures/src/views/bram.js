// Primary view for an individual's page. All elements consistent across each individuals page.
// Designed so that if another individual is to be added, a copy can quickly be made of this template and edited with the appropriate data.

import Header from '../components/header';
import portrait from '../images/Bram Stoker.jpeg';
import Books from '../components/books';

function Bram() {
    return (
        <div className="container-fluid">
            <Header header="Bram Stoker" image={portrait} shuffle="bram"/>
            <div className="row justify-content">
                <div className="col-7 mx-auto">
                    <h2>Bram Stoker (1847-1912)</h2>
                    <p>Abraham, or Bram, Stoker is most famous for writing the Gothic horror novel Dracula. But did you know that he also wrote romance novels? Or that he was bedridden as a child?</p>
                    <p>Born in Dublin, Stoker was too sick to leave his house until the age of seven. During this time, he was told lots of Celtic stories, including tales of malevolent fairies who sometimes drank blood!</p>
                    <p>These myths, along with other European folklore, inspired the story of Dracula. But Stoker drew upon other influences too. After getting married, he moved to London to work for Henry Irving - a well-known stage actor who liked to dramatically sweep his cloak. Count Dracula developed some similar mannerisms.</p>
                    <p>Stoker thought about calling his novel 'The Dead Undead’ and naming the main character ‘Count Wampyr’. But he later settled on Dracula for both, which means ‘devil’ in Romanian. Today, the devilish Dracula features in more than 200 films.</p>
                </div>
                <div className="container">
                    <Books query="Bram Stoker"/>
                </div>
            </div>
        </div>
    )
}

export default Bram;