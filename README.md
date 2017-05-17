## Randomized Extended Kaczmarz in Java <img src="https://travis-ci.org/zouzias/REK-Java.svg?branch=master"/>

The Randomized Extended Kaczmarz algorithm is a randomized algorithm for solving least-squares/linear regression problems.

[Randomized Extended Kaczmarz for Solving Least-Squares.](http://dx.doi.org/10.1137/120889897)
SIAM. J. Matrix Anal. & Appl., 34(2), 773–793. (21 pages) 
Authors: [Anastasios Zouzias](https://github.com/zouzias) and Nikolaos Freris 

## Java

Clone the project. Move to the Java directory, and then type (install maven and Java first)

```
mvn compile test
```

To run a few simple tests. See `TestREKSolverIT.java` for an example how to use the REK least-squares solver.

### Bugs
Please report bugs by opening a new [issue](https://github.com/zouzias/REK-Java/issues/new).

### Implementation Details
The algorithm has been implemented in Java. REK is an implementation of REK with two additional technical features. First, REK utilizes level-1 BLAS routines for all operations of REK and second REK-BLAS additionally stores explicitly the transpose of A for more efficiently memory access of both the rows and columns of A using BLAS (see the above paper for more details). 

The sampling operations of REK are implemented using the so-called `alias method` for generating samples 
from any given discrete distribution [Vos91]. In particular, the alias method, assuming access 
to a uniform random variable on [0,1] in constant time and linear time preprocessing, generates one sample
of a given distribution in constant time. We use an implementation of Keith Schwarz (htiek@cs.stanford.edu).

### Credits and acknowledgments

* Credits go to Warren D. Smith and Keith Schwarz for implementing the aliasing method [Vos91] in C and Java, respectively.
* [Vos91] M. D. Vose. A Linear Algorithm for Generating Random Numbers with a given Distribution. IEEE Trans. Softw. Eng., 17(9):972–975, September 1991.
