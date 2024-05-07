package com.example.demo.practice;

class _Singleton {

    public static _Singleton obj = null;

    private _Singleton() {}

    public synchronized static _Singleton getInstance () {
        if (null == obj) {
            obj = new _Singleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        _Singleton s = _Singleton.getInstance();
        System.out.println(s);
        new Sin();
        new Sin();
        new Sin();
        new Sin();
    }

}

class Sin {
    public Sin(){
        _Singleton s = _Singleton.getInstance();
        System.out.println(s);
    }
}