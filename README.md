# keirin-demo


The Clojure function ["vec"](https://clojuredocs.org/clojure.core/vec) is O(n log n) in time where n is the number of 
elements in the vector which is constructed. However, in practice the behaviour of **vec** is linear as can be seen
from the graph below.


![Graph showing points roughly linear ](https://github.com/rachbowyer/keirin-demo/blob/master/vec-performance.png)

The x-axis shows the number of elements in the vector and the y-axis shows the time to run **vec** in milliseconds. The 
graph is generated using Keirin and the graphing library Analemma


## Building and running the example

Firstly, the ["Analemma library"](https://github.com/liebke/analemma) needs to be downloaded, built and installed locally.
This can be done as follows:

     git clone https://github.com/liebke/analemma.git
     cd analemma
     lein uberjar
     lein install

Then the example should be downloaded, built and run as follows:

     git clone https://github.com/rachbowyer/keirin-demo.git
     cd keirin-demo
     lein uberjar
     ./run

And it outputs the graph "vec-performance.svg".



## License

Distributed under the Eclipse Public License either version 1.0.