import { Link } from "react-router-dom";

function Home() {
    return (
        <div className="App">
            <h1>My favourite sites</h1>
            <ul className="App">
                <li>
                    <h2>imgur</h2>
                    <h3>Imgur is the easiest way to discover and enjoy the magic of the Internet.</h3>
                    <p>An image sharing social network. Allowing you to share images and galleries, as well as comment on the posts of others.</p>
                    <a href="https://imgur.com" target="_blank">https://imgur.com</a>
                </li>
                <li>
                    <h2>Wordle</h2>
                    <h3>Guess the Wordle in six tries.</h3>
                    <p>Wordle is a web-based word game developed by Josh Wardle.<br/>
                    Players have six attempts to guess a five-letter word, with feedback given<br/>
                    for each guess in the form of colored tiles indicating when letters match or occupy the correct position.</p>
                    <a href="https://www.nytimes.com/games/wordle/index.html" target="_blank">https://www.nytimes.com/games/wordle/index.html</a>
                </li>
                <li>
                    <h2>Slate.com</h2>
                    <h3>Slate Magazine - Politics, Business, Technology, and the Arts</h3>
                    <p>Online magazine of news, politics, technology, and culture.<br/>
                    Combines humor and insight in thoughtful analyses of current events and political news.</p>
                    <a href="https://slate.com/" target="_blank">https://slate.com</a>
                </li>
            </ul>
        </div>
    )
}

export default Home;