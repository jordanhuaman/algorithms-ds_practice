import { CircularLL } from "../ds/javascript/CircularLL";
import NodeCLL from "../ds/javascript/node";

var instance = new CircularLL<Number>();
var node = new NodeCLL<Number>(12, null);

console.log(node.getElement());