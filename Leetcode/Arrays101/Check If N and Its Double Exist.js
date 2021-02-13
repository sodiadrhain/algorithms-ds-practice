const checkIfdoubleExist = function (array) {
  while (array.length) {
    const n = array.pop();
    if (array.includes(n * 2) || array.includes(n / 2)) return true;
  }
  return false;
};

checkIfdoubleExist([7, 1, 14, 11]);
