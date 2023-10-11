package exam01;

import lombok.*;

//@Getter @Setter @ToString
////@NoArgsConstructor(access = AccessLevel.PRIVATE) // 기본 생성자
////@NoArgsConstructor
////@AllArgsConstructor
//@EqualsAndHashCode
//@RequiredArgsConstructor
@Data
public class Member {
    private String userId;

//   @ToString.Exclude
//   @NonNull
    private String userPW;
    private String userNm;


}
