import { Component } from 'react';
import PropTypes from 'prop-types';
class MyComponent extends Component {
  static defaultProps = {
    name: '(이름 없음)',
  };

  static propTypes = {
    favoriteNumber: PropTypes.number.isRequired,
  };

  render() {
    const { name, favoriteNumber, children } = this.props;

    return (
      <>
        <div>나의 첫번째 컴포넌트!</div>
        <div>{name}님 반갑습니다.</div>
        <div>좋아하는 숫자 : {favoriteNumber}</div>
        <div>내용 : {children}</div>
      </>
    );
  }
}

export default MyComponent;
