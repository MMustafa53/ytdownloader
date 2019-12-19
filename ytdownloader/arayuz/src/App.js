import React, { useState } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';

function App() {
  const [text, setText] = useState('')
  const onSubmit = () => {
    // do something
    console.log(text)
  }
  return (
<>
  <div className="jumbotron container" >
      <div className="row">
        <div className="col-sm-4"></div>
        <div className="col-sm-4">
          <label className="display-5">Lütfen youtube linki yapıştırın:</label>
          <input className="form-control" type='text' value={text} onChange={e => setText(e.target.value)} placeholder="paste your favoruite youtube vid..."></input>
          <input className="btn btn-primary btn-block" type='submit' onClick={onSubmit} value='İndir'></input>
        </div>
      </div>
    </div>

</>
  );
}

export default App;
