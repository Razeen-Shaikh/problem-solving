/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
	let indices = [];
	nums.forEach((num, index) => {
		for (let i = 0; i < nums.length; i++) {
			if (!(i === index)) {
				if (num + nums[i] === target) {
					indices = [i, index];
				}
			}
		}
	});
	return indices;
};
