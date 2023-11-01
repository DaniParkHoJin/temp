import { Component } from 'react';
class MyComponent extends Component {
  render() {
    const { name } = this.props;
    return (
      <>
        <div>나의 첫번째 컴포넌트!</div>;<div>{name}님 반갑습니다.</div>;
      </>
    );
  }
}

export default MyComponent;
