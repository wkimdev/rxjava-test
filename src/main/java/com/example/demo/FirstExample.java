package com.example.demo;

import io.reactivex.Observable;

public class FirstExample {
	public void emit(){
		//두 항목을 해당 항목을 내보내는 ObservableSource로 변환합니다.
        Observable.just("hello", "rxjava2!!")
            .subscribe(System.out::println);
    }
    public static void main(String[] args) {
        FirstExample firstExample = new FirstExample();
        firstExample.emit();
    }
}
