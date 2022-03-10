import { useState } from "react";

function Todo(props) {
    if(props.todo.isEdit){
        return (
            <span><input value={props.updateText} onChange={props.handleUpdateText}></input></span>
        )
    } else {
        return (
            <span>
                {props.todo.text}
            </span>
        )
    }
}

export default Todo;