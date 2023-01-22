package com.example.calisthenicsworkout.models.squats

import com.example.calisthenicsworkout.R

object SquatsList {

    fun setSquatsList(): ArrayList<SquatsModel>{

        val squatsList = ArrayList<SquatsModel>()

        val jackknifeSquats = SquatsModel(
            1, "Jackknife Squats", "2 sets of 15", "2 sets of 25", "3 sets of 35",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 35 (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "Your legs should be approximately shoulder width apart.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Don’t point them excessively out.\n" +
                    "\n" +
                    "Slow and steady wins the race on this exercise. Don’t just speed through these. Find a controlled, rhythmic pace to really feel this movement. 2 Seconds Down, 1 Second Pause, 2 Seconds Up. Repeat.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. The lower back may round at the very bottom of the movement, which is usually fine.\n" +
                    "\n" +
                    "Find a base from which you can firmly push. If you use a chair or low table, make sure it will not collapse on you and hurt you.\n" +
                    "\n" +
                    "Tighten your core and abs during the movement. You want to feel your body “hinge” at the hips - like a jackknife opening! This is the namesake of the exercise and will involve solid upper and lower body engagement. \n" +
                    "\n" +
                    "Film yourself and watch back between sets!\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in front of a stable platform around knee height.\n" +
                    "\n" +
                    "2. Maintaining straight legs, bend at the hips until your palms are on the platform. Your arms should be relatively straight, as should your waist.\n" +
                    "\n" +
                    "3. Squat down slowly, with a slightly forward lean so you may assist with your arms, until your hamstrings are are pressed against your calves. You should not be able to squat any further.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_jackknife_squats_gif, 0
        )

        squatsList.add(jackknifeSquats)

        val assistedSquats = SquatsModel(
            2, "Assisted Squats", "2 sets of 10", "2 sets of 15", "3 sets of 30",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "This is a good place to start using Gymnastic Rings, if you happen to have them. You can adjust them to your ideal height. Alternatively, you can use a rope or sturdy railing.\n" +
                    "\n" +
                    "Your legs should be approximately shoulder width apart.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Don’t point them excessively out.\n" +
                    "\n" +
                    "Slow and steady wins the race on this exercise. Don’t just speed through these. Find a controlled, rhythmic pace to really feel this movement. 2 Seconds Down, 1 Second Pause, 2 Seconds Up. Repeat.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. The lower back may round at the very bottom of the movement, which is usually fine.\n" +
                    "\n" +
                    "Tighten your core and abs during the movement. You want to feel your body “hinge” at the hips.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in front of a stable platform around hip height.\n" +
                    "\n" +
                    "2. Maintaining straight legs, bend at the hips until your palms are on the platform. Your arms should be relatively straight, as should your waist.\n" +
                    "\n" +
                    "3. Squat down slowly, with a slightly forward lean so you may assist with your arms, until your hamstrings are are pressed against your calves. You should not be able to squat any further.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_assisted_squats_gif, 0
        )

        squatsList.add(assistedSquats)

        val halfSquats = SquatsModel(
            3, "Half Squats", "2 sets of 10", "2 sets of 25", "2 sets of 50",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 50 (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "Because this is the first Squat variation where we do not train a full range of motion, always follow this exercise with a few sets of Assisted Squats or Jackknife Squats to maintain strength in this range!\n" +
                    "\n" +
                    "Some people bend heavily at the hips to make this exercise easier. Don’t make this mistake! Allow a slight forward lean, but squat with your entire lower body.\n" +
                    "\n" +
                    "Your legs should be approximately shoulder width apart.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Don’t point them excessively out.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time.\n" +
                    "\n" +
                    "Tighten your core and abs during the movement. You want to feel your body “hinge” at the hips.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area with your feet shoulder width apart.\n" +
                    "\n" +
                    "2. Place your arms wherever they feel comfortable. Some extend their arms straight in front of them, and others place them across their chest.\n" +
                    "\n" +
                    "3. Squat down slowly until your thighs are parallel with the ground.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_half_squats_gif, 0
        )

        squatsList.add(halfSquats)

        val fullSquats = SquatsModel(
            4, "Full Squats", "2 sets of 10", "2 sets of 20", "2 sets of 30",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "You may be tempted to “bounce” out of the difficult bottom range. While you might be able to do more reps this way, this will only make you weaker. Aim to control every inch of the movement.\n" +
                    "\n" +
                    "Some people bend heavily at the hips to make this exercise easier. Don’t make this mistake! Allow a slight forward lean, but squat with your entire lower body.\n" +
                    "\n" +
                    "Your legs should be approximately shoulder width apart.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Don’t point them excessively out.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. Your lower back may round at the very bottom. This is usually fine.\n" +
                    "\n" +
                    "Tighten your core and abs during the movement. You want to feel your body “hinge” at the hips.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area with your feet shoulder width apart.\n" +
                    "\n" +
                    "2. Place your arms wherever they feel comfortable. Some extend their arms straight in front of them, and others place them across their chest.\n" +
                    "\n" +
                    "3. Squat down slowly until your hamstrings are pressed against your calves and you are unable to descend any further.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_full_squats_gif, 0
        )

        squatsList.add(fullSquats)

        val narrowSquats = SquatsModel(
            5, "Narrow Squats", "2 sets of 10", "2 sets of 15", "2 sets of 30",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "This exercise is done with the heels touching. The feet can be pointed forward or slightly out.\n" +
                    "\n" +
                    "If you lose balance during this exercise, do this near a wall so you can use it balance when needed. Over time, learn this squat without the wall.\n" +
                    "\n" +
                    "Some people bend heavily at the hips to make this exercise easier. Don’t make this mistake! Allow a slight forward lean, but squat with your entire lower body.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. Your lower back may round at the very bottom. This is usually fine.\n" +
                    "\n" +
                    "Tighten your core and abs during the movement. You want to feel your body “hinge” at the hips.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area with your legs straight and heels touching.\n" +
                    "\n" +
                    "2. Place your arms wherever they feel comfortable. Some extend their arms straight in front of them, and others place them across their chest.\n" +
                    "\n" +
                    "3. Squat down slowly until your hamstrings are pressed against your calves and you are unable to descend any further.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "7. Pause for 1 Second.\n" +
                    "\n" +
                    "8. Repeat 3-6.",
            R.drawable.ic_narrow_squats_gif, 0
        )

        squatsList.add(narrowSquats)

        val sideStaggeredSquats = SquatsModel(
            6, "Side Staggered Squats", "2 sets of 10 (per side)", "2 sets of 15 (per side)", "2 sets of 20 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 sets of 20 per side (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "Work one side at a time during a set. This trains your working muscles to operate under constant tension. \n" +
                    "\n" +
                    "The wider your foot positioning, the harder this exercise will be. Start with approximately twice shoulder width if you can!\n" +
                    "\n" +
                    "Move your arms however you wish to balance this exercise. It does not matter much.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. Your lower back may round at the very bottom. This is usually fine.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area with your legs straight and feet twice shoulder width apart. \n" +
                    "\n" +
                    "2. Place your arms wherever they feel comfortable. Some extend their arms straight in front of them, and others place them across their chest.\n" +
                    "\n" +
                    "3. Squat down slowly towards one side until your hamstrings are pressed against your calves and you are unable to descend any further.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_side_staggered_squats_gif, 0
        )

        squatsList.add(sideStaggeredSquats)

        val frontStaggeredSquats = SquatsModel(
            7, "Front Staggered Squats", "2 sets of 7 (per side)", "2 sets of 12 (per side)", "2 sets of 15 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 sets of 15 per side (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "The further your assisting foot, the harder the exercise. Work up to having your assisting foot 2 feet away from your working foot.\n" +
                    "\n" +
                    "Similarly, having your feet shoulder width apart will help your balance. Over time, move your assisting foot directly in front of your working one. This will better simulate the balance necessary for One-Leg Squats\n" +
                    "\n" +
                    "Work one side at a time during a set. This train your working muscles to operate under constant tension. \n" +
                    "\n" +
                    "Move your arms however you wish to balance this exercise. It does not matter much.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. Your lower back may round at the very bottom. This is usually fine.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area with one foot in front of the other. Your legs should be relatively straight.\n" +
                    "\n" +
                    "2. Squat down slowly on your back leg until your hamstrings are pressed against your calves and you are unable to descend any further.\n" +
                    "\n" +
                    "3. Pause for 1 Second.\n" +
                    "\n" +
                    "4. Slowly come back up.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6. Repeat 3-6.",
            R.drawable.ic_front_staggered_squats_gif, 0
        )

        squatsList.add(frontStaggeredSquats)

        val assistedOneLegSquats = SquatsModel(
            8, "Assisted One Leg Squats", "2 sets of 5 (per side)", "2 sets of 9 (per side)", "2 sets of 12 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 sets of 12 per side (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "The standard for this exercise is assisting yourself with something around waist height. This can be Gymnastic Rings or a stable railing or table. Assist yourself with whatever you can to get started!\n" +
                    "\n" +
                    "One-Leg Squats look better with your assisting leg straight and parallel with the ground at the bottom of the movement. While this is a good workout for your hip flexors, it’s not necessary to get started. Try to keep it off to the ground, and work on getting your leg straighter and more mobile over time.\n" +
                    "\n" +
                    "Work one side at a time during a set. This train your working muscles to operate under constant tension. \n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. Your lower back may round at the very bottom. This is usually fine.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area in front of Gymnastic Rings or a stable assisting platform. \n" +
                    "\n" +
                    "2. Grab the assisting platform with your hands and raise one leg off the ground. Both legs should be straight.\n" +
                    "\n" +
                    "3. Squat down slowly on your back leg until your hamstrings are pressed against your calves and you are unable to descend any further.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_assisted_one_leg_squats_gif, 0
        )

        squatsList.add(assistedOneLegSquats)

        val oneLegChairSquats = SquatsModel(
            9, "One Leg Chair Squats", "2 sets of 5 (per side)", "2 sets of 9 (per side)", "2 sets of 12 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 sets of 12 per side (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "The standard for this exercise is squatting from a chair around knee height. If this is too difficult and you find yourself falling the last few inches, then experiment with a higher chair. As you get stronger, lower the chair!\n" +
                    "\n" +
                    "You’ll know you’re making progress with this exercise when you can gently touch the chair with your butt, instead of sitting all the way down!\n" +
                    "\n" +
                    "One-Leg Squats look better with your assisting leg straight and parallel with the ground at the bottom of the movement. While this is a good workout for your hip flexors, it’s not necessary to get started. Try to keep it off to the ground, and work on getting your leg straighter and more mobile over time.\n" +
                    "\n" +
                    "Work one side at a time during a set. This train your working muscles to operate under constant tension. \n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. Your lower back may round at the very bottom. This is usually fine.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area with a safe, stable chair behind you. The chair should be around knee height.\n" +
                    "\n" +
                    "2. Raise one leg off the ground. Both legs should be straight. Use your arms to balance however you choose.\n" +
                    "\n" +
                    "3. Squat down slowly on one leg until your butt gently touches the chair. \n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_one_leg_chair_squats_gif, 0
        )

        squatsList.add(oneLegChairSquats)

        val oneLegSquats = SquatsModel(
            10, "One Leg Squats", "2 sets of 5 (per side)", "2 sets of 9 (per side)", "2 sets of 12 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 sets of 12 per side (Level 3) with GOOD FORM, you are ready to move on to a harder Squat variation.",
            "This exercise is particularly difficult in the bottom range. As a result, you may be tempted to “bounce” out of the bottom. To build strength in this weak point, resist this urge and maintain a brief pause at the bottom.\n" +
                    "\n" +
                    "As you do more reps, it may be hard to maintain your balance sometimes. Do these by a wall and lightly touch it to maintain your balance when necessary.\n" +
                    "\n" +
                    "Try to resist your knees “collapsing inward.” Our knees are hinge joints are don’t resist sideways pressure well. A good rule of thumb is to have your knee go over your second toe (next to your big toe).\n" +
                    "\n" +
                    "One-Leg Squats look better with your assisting leg straight and parallel with the ground at the bottom of the movement. While this is a good workout for your hip flexors, it’s not necessary to get started. Try to keep it off to the ground, and work on getting your leg straighter and more mobile over time.\n" +
                    "\n" +
                    "Work one side at a time during a set. This train your working muscles to operate under constant tension. \n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. This means don’t arch or round your back. This may take some work if you’re not used to it, but you should make progress over time. Your lower back may round at the very bottom. This is usually fine.\n" +
                    "\n" +
                    "Film yourself and watch back between sets\n" +
                    "\n" +
                    "As we are building up progressively, it is okay for your knees to go over your toes. " +
                    "Doing this with an exercise we can competently handle will strengthen our joints in tandem with our muscles.",
            "1. Stand in a safe area.\n" +
                    "\n" +
                    "2. Raise one leg off the ground. Both legs should be straight. Use your arms to balance however you choose.\n" +
                    "\n" +
                    "3. Squat down slowly on one leg until your hamstrings are pressed firmly against your calves.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_one_leg_squats_gif, 0
        )

        squatsList.add(oneLegSquats)

        return squatsList
    }
}