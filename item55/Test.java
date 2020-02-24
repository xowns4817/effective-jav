package item55;

/*
    Optional 이란?
    -> 존재할 수도 있지만 안할 수도 있는 객체. 즉, null이 될 수도 있는 객체를 감싸고 있는 일종의 래퍼 클래스
    효과
        1. null을 직접 다루지 않아도 됨
        2. null 체크를 직접하지 않아도 됨.
        3. 명시적으로 해당 변수가 null일 수도 있는 가능성을 표현할 수 있다.
      Optional 클래스의 정적 팩토리 메소드
        1. Optional.empty( )
            -> null을 담고 있는, 한 마디로 비어있는 Optional 객체를 얻어온다. 이 비어있는 객체는 Optional 내부적으로 미리 생성해놓은 싱글턴 인스턴스이다.
        2. Optional.of(value)
            -> null이 아닌 객체를 담고 있는 Optional 객체를 생성한다. null이 넘어올 경우, NPE를 던지기 때문에 주의해서 사용해야 한다.
        3. Optional.ofNullable(value)
            -> null인지 아닌지 확신할 수 없는 객체를 담고 있는 Optional 객체를 생성한다. Optional.empty( )와 Optional.of(value)를 합쳐놨다고 생각하면 됨.
               null이 넘어올 경우, NPE를 던지지 않고 Optional.empty( )와 동일하게 비어있는 Optional 객체를 얻어온다.
        Optional 객체에 접근
         get( ) 메소드를 사용하면 Optional 객체에 접근할 수 있음.
         만약, Optional 객체에 저장된 값이 NULL 이면, NoSuchElementException 발생
         따라서, get( ) 메소드를 호출하기 전에 isPresent( ) 메소드를 사용하여 Optional 객체에 저장된 값이 null인지 아닌지 먼저 확인한 후 호출 하는 것이 좋음.
         또한, 다음과 같은 메소드를 사용하여 null 대신에 대체할 값을 지정할 수도 있다.
            1. orElse( ) 메소드 : 지정된 값이 존재하면 그 값으 반환하고, 값이 존재하지 않으면 인수로 전달된 값을 반환함.
            2. orElseGet( ) 메소드 : 지정된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 람다 표현식의 결괏값을 반환함
            3. orElseThrow( ) 메소드 : 지정된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 예외를 발생시킴.
    기본 타입의 Optional 클래스
     자바에서는 IntStream 클래스와 같이 기본 타입 스트림을 위한 별도의 Optional 클래스를 제공하고 있다.
     1. OptionalInt 클래스
     2. OptionalLong 클래스
     3. OptionalDouble 클래스
       클래스           저장된 값에 접근하는 메소드
       Optional<T>      T get();
       OptionalInt      int getAsInt();
       OptionalLong     long getAsLong();
       OptionalDouble   double getAsDouble();
       Optional 메소드
        Optional 클래스의 메소드는 다음과 같다.
        메소드                                      설명
        static <T> Optional<T> empty()              아무런 값도 가지지 않는 비어있는 Optional 객체를 반환한다.
        T get( )                                    Optional 객체에 저장된 값을 반환함
        boolean isPresent                           지정된 값이 존재하면 true를 반환하고, 값이 존재하지 않으면 false를 반환함.
        static <T> Optional<T> of(T value)          null이 아닌 명시된 값을 가지는 Optional 객체를 반환함
        static <T> Optional<T> ofNullable(T value)  명시된 값이 null이 아니면  명시된 값을 가지는 Optional 객체를 반환하며, 명시된 값이 null이면 비어있는 Optional 객체를 반환함.
        T orElse(T other)                           저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달될 값을 반환함.
        T orElseGet(Supplier<? extends T> other)    저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 람다 표현식 결괏값을 반환함.
        <X extends Throwalbe> T
        orElseThrow(Supplier<? extends X> exceptionSuplier 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 예외를 발생시킴.
 */

import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;
import java.util.OptionalInt;

public class Test {

    public static void main(String args[ ]) {

        Optional<String> opt = Optional.ofNullable("hello");
        //  Optional<String> opt = Optional.of(null);

        if(opt.isPresent()) {
            System.out.println(opt.get()); // get 메서드는 null을 반환할 경우 error 그래서 isPresent로 null 체크를 해줘야함.
        } else {
            System.out.println("NULL");
        }

        //  Optional<String> opt2 = Optional.ofNullable("김태준");
        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.print(opt2.orElse("NULL !!")); // 값이 있으면 그 값을 출력하고 없으면 orElse뒤에 있는 값을 출력한다.

        OptionalInt optionalInt = OptionalInt.of(100);
        System.out.println(optionalInt.getAsInt());

    }
}