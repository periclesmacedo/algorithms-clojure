# algorithms-clojure

A collection of algorithms done in clojure. I'm also adding multiple versions of the same algorithm, using a few different approaches.

## Usage

To run these algorithms, you need to have [clojure](https://clojure.org/guides/getting_started) installed. In case you also wanna run the tests to these files, you will need [leiningen](https://leiningen.org/) as well.

## How to run

After having clojure installed, you can run each algorithm with:

```
; clojure -m <algorithm-namespace>
clojure -m fibonacci-recur
```

To run the tests, you use:

```
lein test
; or lein test :only fibonacci-reduce-test
; to run the tests of only on algorithm
```
