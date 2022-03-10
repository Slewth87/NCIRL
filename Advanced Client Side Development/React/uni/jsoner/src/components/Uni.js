import { useState } from "react";

function Uni(props) {
    const [moreInfo, setMoreInfo] = useState(false)

    function moreHandler(e) {
        e.preventDefault();
        setMoreInfo(true);
    }

    function lessHandler(e) {
        e.preventDefault();
        setMoreInfo(false);
    }

    if (moreInfo) {
        return (
            <div>
                {props.name}
                <button onClick={lessHandler}>Less</button>
                <ul>
                    <li key="web">
                      {props.web_page}
                    </li>
                </ul>
            </div>
        )
    } else {
        return (
            <div>
                {props.name}
                <button onClick={moreHandler}>More...</button>
            </div>
        )

    }
}

export default Uni;