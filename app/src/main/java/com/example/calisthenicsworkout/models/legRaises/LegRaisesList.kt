package com.example.calisthenicsworkout.models.legRaises

import com.example.calisthenicsworkout.R

object LegRaisesList {

    fun setLegRaisesList(): ArrayList<LegRaisesModel>{

        val legRaisesList = ArrayList<LegRaisesModel>()

        val kneeRaises = LegRaisesModel(1, "Knee Raises", "2 sets of 10", "2 sets of 20", "2 sets of 30",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "Keep your heels off the ground throughout the exercise, Touching the ground at the bottom of the movement makes this exercise easier. Do this if necessary at first, but strive to break this habit eventually.\n" +
                    "\n" +
                    "The more you extend your knees, the harder this exercise. For Knee Raises, try to maintain a 90 degree bend.\n" +
                    "\n" +
                    "Try to keep your lower back on the ground throughout the exercise. Depending on your body shape, this may be difficult or impossible. " +
                    "However, maintain the intent to touch your lower back.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "If your lower back hurts, using a small pillow or small rolled up towel underneath your lower back is a temporary solution.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Lie flat on the floor with your arms by your side.\n" +
                    "\n" +
                    "2. Bend your knees until they are approximately 90 degrees.\n" +
                    "\n" +
                    "3. Bring your legs up until your knees are over your waist. Control the movement.\n" +
                    "\n" +
                    "4. Pause for 1 Second, feeling the contraction in your hips and abs.\n" +
                    "\n" +
                    "5. Slowly descend while straightening your legs until your heels are about 1 inch off the ground.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat  3-6.",
            R.drawable.ic_knee_raises_gif, 0)

        legRaisesList.add(kneeRaises)

        val advancedKneeRaises = LegRaisesModel(2, "Advanced Knee Raises", "2 sets of 10", "2 sets of 20", "2 sets of 30",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "Keep your heels off the ground throughout the exercise, Touching the ground at the bottom of the movement makes this exercise easier. " +
                    "Do this if necessary at first, but strive to break this habit eventually.\n" +
                    "\n" +
                    "Try to maintain a 45 degree bend.\n" +
                    "\n" +
                    "Try to touch your lower back to the ground as your legs go up. This strengthens our waist flexion. " +
                    "Depending on your body shape, this may be difficult or impossible. However, maintain the intent to touch your lower back.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "If your lower back hurts, using a small pillow or small rolled up towel underneath your lower back is a temporary solution.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Lie flat on the floor with your arms by your side.\n" +
                    "\n" +
                    "2. Bend your knees until they are approximately 45 degrees.\n" +
                    "\n" +
                    "3. Bring your legs up until your knees are over your waist. Control the movement.\n" +
                    "\n" +
                    "4. Pause for 1 Second, feeling the contraction in your hips and abs.\n" +
                    "\n" +
                    "5. Slowly descend, maintaining the 45 degree bend until your heels at 1 inch off the ground.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat  3-6.",
            R.drawable.ic_advanced_knee_raises_gif, 0)

        legRaisesList.add(advancedKneeRaises)

        val alternatingLegRaises = LegRaisesModel(3, "Alternating Leg Raises", "2 sets of 10", "2 sets of 15", "2 sets of 25",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 25 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "Keep your heels off the ground throughout the exercise, Touching the ground at the bottom of the movement makes this exercise easier. " +
                    "Do this if necessary at first, but strive to break this habit eventually.\n" +
                    "\n" +
                    "At the top of the movement, straighten your legs, push them up, and try to touch your lower back. This increases waist activation.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "If your lower back hurts, using a small pillow or small rolled up towel underneath your lower back is a temporary solution.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Lie flat on the floor with your arms by your side.\n" +
                    "\n" +
                    "2. Bend your knees until they are approximately 45 degrees.\n" +
                    "\n" +
                    "3. Bring your legs up until your knees are over your waist. Control the movement.\n" +
                    "\n" +
                    "4. Straighten at the knees.\n" +
                    "\n" +
                    "5. Pause for 1 Second, feeling the contraction in your hips and abs.\n" +
                    "\n" +
                    "6. Slowly descend, maintaining straight legs until your heels are 1 inch off the ground.\n" +
                    "\n" +
                    "7. Pause for 1 Second.\n" +
                    "\n" +
                    "8. Repeat  3-6.",
            R.drawable.ic_alternating_leg_raises_gif, 0)

        legRaisesList.add(alternatingLegRaises)

        val fullLegRaises = LegRaisesModel(4, "Full Leg Raises", "2 sets of 5", "2 sets of 15", "2 sets of 25",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 25 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "Keep your heels off the ground throughout the exercise, Touching the ground at the bottom of the movement makes this exercise easier. " +
                    "Do this if necessary at first, but strive to break this habit eventually.\n" +
                    "\n" +
                    "Like the previous step, you may have trouble straightening your legs at first. Work on this over time.\n" +
                    "\n" +
                    "Pointing your toes will make this exercise look slightly nicer and decrease hamstring flexibility requirements. " +
                    "However, aim to be able to do this regardless of your ankle position.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "If your lower back hurts, using a small pillow or small rolled up towel underneath your lower back is a temporary solution.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Lie flat on the floor with your arms by your side.\n" +
                    "\n" +
                    "2. Maintaining straight legs, bring your legs up until your knees are over your waist. Control the movement.\n" +
                    "\n" +
                    "3. Pause for 1 Second, feeling the contraction in your hips and abs.\n" +
                    "\n" +
                    "4. Slowly descend, maintaining straight legs until your heels are 1 inch off the ground.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6.Repeat  3-5.",
            R.drawable.ic_full_leg_raises_gif, 0)

        legRaisesList.add(fullLegRaises)

        val tuckPlowRaises = LegRaisesModel(5, "Tuck Plow Raises", "2 sets of 10", "2 sets of 15", "2 sets of 20",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 20 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "You may have trouble getting your waist to flex this far. Think of this as a “strength stretch.” " +
                    "Spend a few seconds at the top trying to press your thighs firmly against your chest. Combine this with some lower back stretches will give you the necessary mobility over time. Progressive Jefferson Curls or Elephant Walks work well.\n" +
                    "\n" +
                    "If this exercise causes cramping, take a few moments to relax and stretch before revisiting it.\n" +
                    "\n" +
                    "Because we are bending our knees again, the bottom part of this movement will be significantly easier than the previous step. " +
                    "Follow this exercise with a set of Full Leg Raises.\n" +
                    "\n" +
                    "Don’t let your heels touch at the bottom of the movement. Keep them an inch off the ground.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "If your lower back hurts, using a small pillow or small rolled up towel underneath your lower back is a temporary solution.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Lie flat on the floor with your arms by your side.\n" +
                    "\n" +
                    "2. Smoothly bend your knees while bringing your legs up until your thighs are firmly pressed against your chest. Your lower back should be slightly off the ground.\n" +
                    "\n" +
                    "3. Pause for 2-3 Seconds, trying to press your thighs as firmly as safely possible against your chest.\n" +
                    "\n" +
                    "4. Slowly descend, gradually straightening your legs until your heels are 1 inch above the ground.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6. Repeat 2-5.",
            R.drawable.ic_tuck_plow_raises_gif, 0)

        legRaisesList.add(tuckPlowRaises)

        val plowRaises = LegRaisesModel(6, "Plow Raises", "2 sets of 10", "2 sets of 15", "2 sets of 20",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 20 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "You may have trouble getting your waist to flex this far. Think of this as a “strength stretch.” " +
                    "Spend a few seconds at the top trying to press your thighs firmly against your chest. " +
                    "Come this with some lower back stretches will give you the necessary mobility over time. " +
                    "Progressive Jefferson Curls or Elephant Walks work well.\n" +
                    "\n" +
                    "It may be difficult to keep straight legs throughout the exercise. " +
                    "Follow this exercise with some hamstring stretches and you will eventually be able to do this!\n" +
                    "\n" +
                    "If this exercise causes cramping, take a few moments to relax and stretch before revisiting it.\n" +
                    "\n" +
                    "Don’t let your heels touch at the bottom of the movement. Keep them an inch off the ground.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "If your lower back hurts, using a small pillow or small rolled up towel underneath your lower back is a temporary solution.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Lie flat on the floor with your arms by your side.\n" +
                    "\n" +
                    "2. Maintaining straight legs, smoothly bring your legs up until your toes touch the floor behind you. Your lower back should be slightly off the ground.\n" +
                    "\n" +
                    "3. Pause for 2-3 Seconds, trying to press your thighs as firmly as safely possible against your chest.\n" +
                    "\n" +
                    "4. Slowly descend, gradually straightening your legs until your heels are 1 inch above the ground.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6. Repeat 2-5.",
            R.drawable.ic_plow_raises_gif, 0)

        legRaisesList.add(plowRaises)

        val hangingKneeRaises = LegRaisesModel(7, "Hanging Knee Raises", "2 sets of 5", "2 sets of 10", "2 sets of 15",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 15 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "Maintain a firm grip throughout the exercise. If you do not have the grip strength necessary for this, work just hanging from a bar until you do. \n" +
                    "\n" +
                    "The straighter your legs, the harder this exercise is. Aim to bend your knees at 90 degrees at the top of this exercise.\n" +
                    "\n" +
                    "You may need to bend your arms and keep your shoulders “down” to avoid pain at first. " +
                    "Work towards gradually straightening your arms and relaxing your shoulders for maximal core work.\n" +
                    "\n" +
                    "Try to keep your pelvis tilted back at the bottom of the exercise. This will keep your working muscles braced throughout. " +
                    "While not necessary, this helps some people avoid lower back pain.\n" +
                    "\n" +
                    "It may be tempting to forcefully bring up your knees. While there is a place for this, aim to do this exercise slowly under full control first. " +
                    "Then explore explosive movement as you’d like.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Grab an overhead bar or rings with a shoulder width grip.\n" +
                    "\n" +
                    "2. Engage your core by tilting your pelvis back.\n" +
                    "\n" +
                    "3. Smoothly bring your legs up, simultaneously bending your knees until your thighs are parallel to the ground.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly reverse the movement, straightening your legs and keeping your pelvis rotated back.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-5.",
            R.drawable.ic_hanging_knee_raises_gif, 0)

        legRaisesList.add(hangingKneeRaises)

        val advancedHangingKneeRaises = LegRaisesModel(8, "Advanced Hanging Knee Raises", "2 sets of 5", "2 sets of 10", "2 sets of 15",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 15 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "The straighter your legs, the more difficult this exercise. Aim to maintain a 45 degree bend throughout the exercise.\n" +
                    "\n" +
                    "Maintain a firm grip throughout the exercise. If you do not have the grip strength necessary for this, work just hanging from a bar until you do. \n" +
                    "\n" +
                    "You may need to bend your arms and keep your shoulders “down” to avoid pain at first. Work towards gradually straightening your arms and relaxing your shoulders for maximal core work.\n" +
                    "\n" +
                    "Try to keep your pelvis tilted back at the bottom of the exercise. This will keep your working muscles braced throughout. While not necessary, this helps some people avoid lower back pain.\n" +
                    "\n" +
                    "It may be tempting to forcefully bring up your legs. While there is a place for this, aim to do this exercise slowly under full control first. Then explore explosive movement as you’d like.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Grab an overhead bar or rings with a shoulder width grip.\n" +
                    "\n" +
                    "2. Engage your core by tilting your pelvis back.\n" +
                    "\n" +
                    "3. Bend your knees into a 45 degree angle.\n" +
                    "\n" +
                    "4. Smoothly bring your legs up, maintaining your knee bend until your thighs are parallel to the ground.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6. Slowly reverse the movement, maintaining knee bend and keeping your pelvis rotated back.\n" +
                    "\n" +
                    "7. Pause for 1 Second.\n" +
                    "\n" +
                    "8. Repeat 4-7.",
            R.drawable.ic_advanced_hanging_knee_raises_gif, 0)

        legRaisesList.add(advancedHangingKneeRaises)

        val hangingLegRaises = LegRaisesModel(9, "Hanging Leg Raises", "2 sets of 10", "2 sets of 15", "2 sets of 25",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 25 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "Keep your legs straight throughout the exercise.\n" +
                    "\n" +
                    "Maintain a firm grip throughout the exercise. If you do not have the grip strength necessary for this, work just hanging from a bar until you do. \n" +
                    "\n" +
                    "You may need to bend your arms and keep your shoulders “down” to avoid pain at first. Work towards gradually straightening your arms and relaxing your shoulders for maximal core work.\n" +
                    "\n" +
                    "Try to keep your pelvis tilted back at the bottom of the exercise. This will keep your working muscles braced throughout. While not necessary, this helps some people avoid lower back pain.\n" +
                    "\n" +
                    "It may be tempting to forcefully bring up your legs. While there is a place for this, aim to do this exercise slowly under full control first. Then explore explosive movement as you’d like.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Grab an overhead bar or rings with a shoulder width grip.\n" +
                    "\n" +
                    "2. Engage your core by tilting your pelvis back.\n" +
                    "\n" +
                    "3. Smoothly bring your legs up, keeping them perfectly straight until they are parallel to the ground.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly reverse the movement, keeping your pelvis rotated back.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_hanging_leg_raises_gif, 0)

        legRaisesList.add(hangingLegRaises)

        val toeToBars = LegRaisesModel(10, "Toe To Bars", "2 sets of 10", "2 sets of 15", "2 sets of 25",
            false, false, false,
            "Do 2 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 25 (Level 3) with GOOD FORM, you are ready to move on to a harder Leg Raise variation.",
            "Keep your legs straight throughout the exercise.\n" +
                    "\n" +
                    "Avoid leaning back in this exercise as much as possible. Though it may be necessary to some extent, leaning back too far will bring in your lats and decrease core work.\n" +
                    "\n" +
                    "Do not do this exercise if your grip is failing. Falling on your lower back can paralyze you or worse.\n" +
                    "\n" +
                    "Try to keep your pelvis tilted back at the bottom of the exercise. This will keep your working muscles braced throughout. While not necessary, this helps some people avoid lower back pain.\n" +
                    "\n" +
                    "It may be tempting to forcefully bring up your legs. While there is a place for this, aim to do this exercise slowly under full control first. Then explore explosive movement as you’d like.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keeping your thighs pressed together may help you focus on the movement.",
            "1. Grab an overhead bar or rings with a shoulder width grip.\n" +
                    "\n" +
                    "2. Engage your core by tilting your pelvis back.\n" +
                    "\n" +
                    "3. Smoothly bring your legs up, keeping them perfectly straight until they touch the bar or your thighs are compressed against your chest.\n" +
                    "\n" +
                    "4. Pause for 2-3 Seconds, firmly pressing your thighs against your chest.\n" +
                    "\n" +
                    "5. Slowly reverse the movement, keeping your pelvis rotated back.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_toe_to_bars_gif, 0)

        legRaisesList.add(toeToBars)

        return legRaisesList
    }
}