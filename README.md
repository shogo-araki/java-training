## docker ビルド

% docker-compose build

## docker をバックグラウンドで起動

% docker-compose up -d

## 確認

% docker-compose ps
```
Name                 Command   State   Ports
-------------------------------------------------------------
java-spring_java_1   jshell    Up      0.0.0.0:8080->8080/tcp
```

## インスペクション

% docker-compose exec java bash

## コンパイル

root@894bf34204ab:/usr/src/# javac Main.java

## 実行

root@894bf34204ab:/usr/src/# java Main
Hello World!

## 参考
- [Docker × Java シンプルすぎる開発環境構築](https://qiita.com/A-Kira/items/0dda255e00771f556e2a)
- [一週間で身につくJava言語の基本](http://java.sevendays-study.com/index.html)
