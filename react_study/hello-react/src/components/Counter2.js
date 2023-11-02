import { useState } from 'react';
const Counter = () => {
  const [number, setnumber] = useState();

  return (
    <div>
      <h1>{number}</h1>
      <button type="button" onClick={() => setnumber(number + 1)}>
        +1
      </button>
    </div>
  );
};

export default Counter;
