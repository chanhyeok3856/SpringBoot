import React, { useState, useEffect } from 'react';
import './App.css';
function App( ) {
const [count, setCount] = useState(0);
useEffect(( ) => {
console.log('컴포넌트가 마운트되었습니다.');
console.log(`현재 카운트 값: ${count}`);
return ( ) => {
console.log('컴포넌트가 언마운트되었습니다.');
};
}, [count]);
return (
<div className="App">
<p>현재 카운터 수 : {count}</p>
<button onClick={( ) => setCount(count + 1)}>카운트 증가</button>
</div>
);
}
export default App;