var lengthOfLongestSubstring = function (s: String) {
  let lws = ''
  const Alws = s.split('')

  console.log(Alws.length)

  if (s.length === 1) {
    lws = lws + Alws[0];
  }

  for (let i = 0; i <= s.length; i++) {

  }

  return lws
}

console.log(lengthOfLongestSubstring('hoola'))