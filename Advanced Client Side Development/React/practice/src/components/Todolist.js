import axios from "axios";
import { useState } from "react";
import Todo from "./Todo";

function Todolist() {
    const [todos, setTodos] = useState([]);
    const [text, setText] = useState("");
    const [id, setId] = useState(0);
    const [updateText, setUpdateText] = useState("");

    async function getTodos() {
        var data = await axios.get("http://localhost:3001")
        console.log(data)
    }
    function inputHandler(e) {
        e.preventDefault();
        setText(e.target.value);
    }

    function submissionHandler(e) {
        e.preventDefault();
        setTodos(
            function(todosArr) {
                setId(id+1)
                return [ ...todosArr, {text: text, id:id, isEdit:false}]
            }
        )
    }

    function handleUpdateText(e) {
        e.preventDefault();
        setUpdateText(e.target.value);
    }

    function delHandler(e, id) {
        var todosArr = [...todos]
        var index = todos.indexOf(todos.find(
            function(todo) {
                return todo.id === id
            }
        ))
        todosArr.splice(index, 1)
        setTodos(todosArr)
    }

    function editHandler(e, id) {
        e.preventDefault();
        var todosArr = [...todos]
        var index = todosArr.indexOf(todosArr.find(function(todo) {
            return todo.id === id
        }))
        todosArr[index].isEdit = true;
        setUpdateText(todosArr[index].text)
        setTodos(todosArr);
    }

    function handleUpdate(e, id) {
        e.preventDefault();
        var todosArr = [...todos]
        var index = todosArr.indexOf(todosArr.find(function(todo){
            return todo.id === id
        }))
        todosArr[index].isEdit = false
        setUpdateText("");
        todosArr[index].text = updateText;
        setTodos(todos);
    }

    return (
        <div>
            <input value={text} onChange={inputHandler}/>
            <button onClick={submissionHandler}>Add todo</button>
            <ul>
                {todos.map(function(i, index) {
                    if(i.isEdit) {
                        return (
                            <li key={index}>
                                <Todo todo={todos[index]} handleUpdateText={handleUpdateText} updateText={updateText}/>
                                <button onClick={function(e) {
                                    handleUpdate(e, i.id)
                                }}>Change</button>
                            </li>
                        )
                    } else {
                        return (
                            <li key={index}>
                                <Todo todo={todos[index]} editHandler={editHandler} updateText={updateText}/>
                                <button onClick={function (e) {
                                    delHandler(e, i.id)
                                }}>Delete</button>
                                <button onClick={function(e) {
                                    editHandler(e, i.id)
                                }}>Update</button>
                            </li>
                        )
                    }
                })}
            </ul>
        </div>
    )
}

export default Todolist;