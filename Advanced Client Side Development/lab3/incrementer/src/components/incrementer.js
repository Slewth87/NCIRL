import { useState } from "react";

function Incrementer() {
    const [numero, setNumero] = useState(0);

    function goUp(e) {
        e.preventDefault()
        setNumero(numero+1)
    }

    function goDown(e) {
        e.preventDefault()
        setNumero(numero-1)
    }

    return (
        <div>
            <p>{numero}</p>
            <button onClick={goUp}>+</button>
            <button onClick={goDown}>-</button>
        </div>
    )
}

export default Incrementer;