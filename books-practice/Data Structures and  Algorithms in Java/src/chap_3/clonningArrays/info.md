 
# Cloning Arrays in JavaScript/TypeScript

## Shallow Copy vs Deep Copy

---

### Shallow Copy
- **Definition:** Copies only the top-level elements. If the array contains objects or other arrays, only their references are copied, not the nested data itself.
- **Methods:**
	- Spread operator: `const copy = [...original];`
	- `slice()`: `const copy = original.slice();`
	- `Array.from()`: `const copy = Array.from(original);`
- **Example:**
	```typescript
	const arr = [{x: 1}, {y: 2}];
	const shallow = [...arr];
	shallow[0].x = 99;
	// arr[0].x is now 99 (shared reference)
	```
- **When to use:**
	- When the array contains only primitive values (numbers, strings, booleans).

---

### Deep Copy
- **Definition:** Recursively copies all nested objects and arrays, creating a fully independent clone.
- **Method:**
	- `const deep = JSON.parse(JSON.stringify(original));`
- **Example:**
	```typescript
	const arr = [{x: 1}, {y: 2}];
	const deep = JSON.parse(JSON.stringify(arr));
	deep[0].x = 99;
	// arr[0].x is still 1 (no shared reference)
	```
- **Caveats:**
	- Only works for data that can be serialized to JSON (no functions, undefined, special objects).
- **When to use:**
	- When you need a true, independent copy of nested data structures.

---

## Summary Table

| Copy Type     | Top-level Primitives | Nested Objects/Arrays | Methods                                 |
|--------------|---------------------|----------------------|-----------------------------------------|
| Shallow Copy | ✅                  | ❌ (references only) | `[...arr]`, `arr.slice()`, `Array.from()`|
| Deep Copy    | ✅                  | ✅                   | `JSON.parse(JSON.stringify(arr))`        |

---

> **Tip:** For arrays of primitives, shallow copy is enough. For arrays/objects with nested objects, use a deep copy for full independence.
