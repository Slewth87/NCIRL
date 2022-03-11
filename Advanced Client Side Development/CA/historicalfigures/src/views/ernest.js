import Header from '../components/header';
import portrait from '../images/Ernest Shackleton.jpeg';
import Books from '../components/books';

function Ernest() {
    return (
        <div className="container-fluid">
            <Header header="Ernest Shackleton" image={portrait} shuffle="ernest"/>
            <div className="row justify-content">
                <div className="col-7 mx-auto">
                    <h2>Ernest Shackleton (1874-1922)</h2>
                    <p>Born in Kildare and educated in London, Ernest Shackleton developed a passion for adventure by reading books as a child. At just 16, he became a ship’s apprentice and quickly rose through the ranks.</p>
                    <p>Shackleton aspired to be an explorer, but Europeans had already visited most of the world. So he wanted to be the first person to reach the South Pole.</p>
                    <p>In 1902, aged 27, Shackleton was just 400 miles from his goal. But his crew and sled dogs fell ill, so he had to turn back. On another trip, he was only 97 miles away. But once again, he was forced to retreat because of a food shortage. Shortly afterward, another explorer got there first.</p>
                    <p>Even then, Shackleton didn’t give up and decided to cross the Antarctic instead. With 69 dogs on-board and a 1.3 metre bow for breaking ice, his ship - the Endurance - set out. But it got stuck!</p>
                    <p>To save his crew, Shackleton bravely embarked on a legendary trip, crossing rough seas, mountains and glaciers. . .</p>
                </div>
                <div className="container">
                    <Books query="Ernest Shackleton"/>
                </div>
            </div>
        </div>
    )
}

export default Ernest;