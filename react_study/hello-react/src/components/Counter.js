import { Component } from 'react';

class Counter extends Component {
  state = {
    number: 0,
  };
  //   constructor(props) {
  //     super(props);

  //     // 초기값
  //     this.state = {
  //       number: props.number,
  //     };
  //   }

  render() {
    const { number } = this.state;
    return (
      <div>
        <h1>{number}</h1>
        <button
          type="button"
          onClick={() => {
            this.setState({ number: number + 1 });
          }}
        >
          +1
        </button>
      </div>
    );
  }
}

export default Counter;
