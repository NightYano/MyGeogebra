package Parsor;

import Geometric.Line;

/** The interface of the parsor. Will parse the input given by user into a list of points
 *  Operators hierarchy:
 *      1. Mathematical functions (cos, sqrt, ...)
 *      2. Parenthesis
 *      3. Exponential
 *      4. Multiplication and Division
 *      5. Addition and subtraction
 */
public interface IParsor {

    Line parse(String function);

}
