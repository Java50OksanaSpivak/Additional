package additionalFunc;

public interface MyPredicate<T> {
	boolean test(T t);
	 
    default MyPredicate<T> and(MyPredicate<? super T> other) {
    	return (t) -> test(t) && other.test(t);
    }
    
    default MyPredicate<T> negate() {
        return (t) -> !test(t);
    }

    default MyPredicate<T> or(MyPredicate<? super T> other) {
        return (t) -> test(t) || other.test(t);
    }
}
