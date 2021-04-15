# keirin-demo


The Clojure function ["vec"](https://clojuredocs.org/clojure.core/vec) is O(n log n) in time, when constructing a 
vector of n elements. However, in practice the behaviour of **vec** is linear as can be seen
from the graph below.


![Graph showing points linear](https://static.wixstatic.com/media/3466eb_2285dfe216a54ec38809abe11ccf0a5d~mv2.png/v1/fill/w_540,h_298,al_c,q_85,usm_0.66_1.00_0.01/Vec%20-%20Keirin1.webp)

The graph was generated using Keirin and the graphing library Analemma


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
     ./run.sh

And it outputs the graph "vec-performance.svg".



## License

Distributed under the Eclipse Public License version 1.0.