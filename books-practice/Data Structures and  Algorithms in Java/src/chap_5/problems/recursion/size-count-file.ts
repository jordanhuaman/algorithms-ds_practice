const contFileSize = (root: any) => {
  let total = root.size;
  if (root.isdirectory()) {
    for (let childName of root.list()) {
      const child = new File(root, childName);
      total += contFileSize(child);
    }
  }
  console.log(total + "\t" + root);
  return total;
}