package com.example.calisthenicsworkout.models.pullups

import com.example.calisthenicsworkout.R

object PullUpsList {

    fun setPullUpsList(): ArrayList<PullUpModel>{

        val pullUpsList = ArrayList<PullUpModel>()

        val wallPullUps = PullUpModel(
            1, "Wall Pull Ups", "2 sets of 30", "2 sets of 50", "3 sets of 50",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 50 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "Slow and steady wins the race on this exercise. Don’t just speed through these. Find a controlled, rhythmic pace to really feel this movement. 2 Seconds Down, 1 Second Pause, 2 Seconds Up. Repeat.\n" +
                    "\n" +
                    "Keep your hands around sternum height. Your fist should touch your chest at the top of the movement.\n" +
                    "\n" +
                    "Regardless of where you do this exercise, make sure you have a good grip on the object. A slippery surface will make holding on difficult, which is not the goal of this exercise.\n" +
                    "\n" +
                    "Keep your body firm. Don’t arch your body at the bottom to make the motion easier. " +
                    "Core strength is important for all calisthenics, and this is a great place to start building it.",
            "1. Stand at arm’s length facing a pole, tree, or wall section.\n" +
                    "\n" +
                    "2. Firmly grasp the object with both arms. Your arms should be straight.\n" +
                    "\n" +
                    "3. Ascend slowly until the object or your hands gently touch your chest.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_wall_pull_ups_gif, 0
        )

        pullUpsList.add(wallPullUps)

        val horizontalPullUps = PullUpModel(
            2, "Horizontal Pull Ups", "2 sets of 15", "2 sets of 30", "3 sets of 30",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "The higher the base you grasp - the easier this exercise.  For this step, find something around sternum height.\n" +
                    "\n" +
                    "Try to maintain a consistent height so you can better judge your progress. Small adjustments over time are fine!\n" +
                    "\n" +
                    "This is where having a set of Gymnastic Rings really shines. They’ll allow you to pull higher. If using a bar, pull until your chest touches the bar. If using rings, pull until your fists are by your chest.\n" +
                    "\n" +
                    "Keep your body firm. Don’t arch your body at the bottom to make the motion easier. " +
                    "Core strength is important for all calisthenics, and this is a great place to start building it.",
            "1. Get below a horizontal base that is sternum height when you’re standing.\n" +
                    "\n" +
                    "2. Firmly grasp the base with both arms at shoulder width. Your arms should be straight.\n" +
                    "\n" +
                    "3. Ascend slowly until the base or your hands gently touch your chest.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_horizontal_pull_ups_gif, 0
        )

        pullUpsList.add(horizontalPullUps)

        val advancedHorizontalPullUps = PullUpModel(
            3, "Advanced Horizontal Pull Ups", "2 sets of 10", "2 sets of 15", "3 sets of 25",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 25 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "Start filming yourself around this step. Watch back between sets to monitor your form!\n" +
                    "\n" +
                    "The higher the base you grasp - the easier this exercise.  For this step, find something around hip height.\n" +
                    "\n" +
                    "Try to maintain a consistent height so you can better judge your progress. Small adjustments over time are fine!\n" +
                    "\n" +
                    "This is where having a set of Gymnastic Rings really shines. They’ll allow you to pull higher. If using a bar, pull until your chest touches the bar. If using rings, pull until your fists are by your chest.\n" +
                    "\n" +
                    "Keep your body firm. Don’t arch your body at the bottom to make the motion easier. " +
                    "Core strength is important for all calisthenics, and this is a great place to start building it.",
            "1. Get below a horizontal base that is hip height when you’re standing.\n" +
                    "\n" +
                    "2. Firmly grasp the base with both arms at shoulder width. Your arms should be straight.\n" +
                    "\n" +
                    "3. Ascend slowly until the base or your hands gently touch your chest.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_advanced_horizontal_pull_ups_gif, 0
        )

        pullUpsList.add(advancedHorizontalPullUps)

        val jackknifePullUps = PullUpModel(
            4, "Jackknife Pull Ups", "2 sets of 5", "2 sets of 15", "3 sets of 20",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 20 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "Positioning is key for Jackknife Pullups. Your torso should be slightly behind the bar. You should be able to pull your chin above the rings or bar. If you feel like your legs are “too short” to assist at the top, move your body back a bit.\n" +
                    "\n" +
                    "Similarly, find an ideal height for the base or rings. Your butt should be an inch or so off the ground while maintaining straight arms at the bottom.\n" +
                    "\n" +
                    "At first, your torso will start off vertical and lean back as you go up. Over time, try to maintain a somewhat vertical torso as you ascend.\n" +
                    "\n" +
                    "This is where having a set of Gymnastic Rings really shines. They’ll allow you to pull higher. If using a bar, pull until your chest touches the bar. If using rings, pull until your fists are by your chest.\n" +
                    "\n" +
                    "While you will need to hinge at the hips for this exercise, maintain tension in your core and legs. Avoid sagging!\n" +
                    "\n" +
                    "Video yourself and watch back between sets to monitor your form!",
            "1. Sit below a horizontal base with your legs straight in front of you.\n" +
                    "\n" +
                    "2. Firmly grasp the base with both arms at shoulder width. Your arms should be straight and your butt off the ground.\n" +
                    "\n" +
                    "3. Ascend slowly until the base or your hands gently touch your chest. Assist with your legs as necessary.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_jackknife_pull_ups_gif, 0
        )

        pullUpsList.add(jackknifePullUps)

        val fullPullUps = PullUpModel(
            5, "Full Pull Ups", "1 set of 3", "2 sets of 6", "3 sets of 12",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 12 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "“Perfect form” for Full Pullups is often debated. You’ll get different answers depending on who you ask. As long as you build up to your technique progressively (without sudden increases in resistance), you should be safe. Aim be able to do all of them!\n" +
                    "\n" +
                    "It’s common to refer an overhand grip as Pullups and an underhand grip as Chinups. Overhand will have more emphasis on the back and underhand will have more emphasis on the biceps. They are comparable in difficulty. Aim to master both, as well as a neutral grip (thumbs facing back)!\n" +
                    "\n" +
                    "Having Gymnastic Rings here will allow your hands to rotate freely as you do this exercise.\n" +
                    "\n" +
                    "Video yourself and watch back between sets to monitor your form!",
            "1. Stand below a horizontal bar or rings\n" +
                    "\n" +
                    "2. Firmly grasp the bar with both arms at shoulder width. Your entire body should be straight and off the ground.\n" +
                    "\n" +
                    "3. Ascend slowly until your chest gently touches the bar (or just below).\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_full_pull_ups_gif, 0
        )

        pullUpsList.add(fullPullUps)

        val narrowPullUps = PullUpModel(
            6, "Narrow Pull Ups", "2 sets of 3", "2 sets of 6", "3 sets of 9",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 3 Sets of 9 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "It is usually more comfortable to do this exercise with an underhand or neutral grip.\n" +
                    "\n" +
                    "“Perfect form” for Pullups is often debated. You’ll get different answers depending on who you ask. As long as you build up to your technique progressively (without sudden increases in resistance), you should be safe. Aim be able to do all of them!\n" +
                    "\n" +
                    "If you are using Gymnastic Rings, you may be able to do this on one ring. Make sure the single ring can support your weight!\n" +
                    "\n" +
                    "Video yourself and watch back between sets to monitor your form!",
            "1. Stand below a horizontal bar or rings\n" +
                    "\n" +
                    "2. Firmly grasp the bar with both hands. Your hands should be together. Your entire body should be straight and off the ground.\n" +
                    "\n" +
                    "3. Ascend slowly until your chest gently touches your hands.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_narrow_pull_ups_gif, 0
        )

        pullUpsList.add(narrowPullUps)

        val oneHandPullUps = PullUpModel(
            7, "One Hand Pull Ups", "2 sets of 3 (per hand)", "2 sets of 6 (per hand)", "2 sets of 9 (per hand)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 9 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "The lower your supporting hand, the harder the exercise. Start with a grip on your wrist.\n" +
                    "\n" +
                    "If your supporting hand leaves bruises on your wrist, you may be supporting too much. Over time, allow a firm grip that doesn’t leave bruises. Your working arm will get stronger as a result.\n" +
                    "\n" +
                    "As with Narrow Pullups, this exercise is usually done with an underhand grip.\n" +
                    "\n" +
                    "If you are using Gymnastic Rings, you may be able to do this on one ring. Make sure the single ring can support your weight!\n" +
                    "\n" +
                    "Video yourself and watch back between sets to monitor your form!\n" +
                    "\n" +
                    "Allow your shoulder blades to move naturally. Retract them at the top and protract them at the bottom.",
            "1. Stand below a horizontal bar or rings\n" +
                    "\n" +
                    "2. Firmly grasp the bar with one hand. Use your other hand and placing it on your the wrist of your working arm. \n" +
                    "\n" +
                    "3. Ascend slowly until your chest gently touches your hand.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_one_hand_pull_ups_gif, 0
        )

        pullUpsList.add(oneHandPullUps)

        val advancedOneHandPullUps = PullUpModel(
            8, "Advanced One Hand Pull Ups", "2 sets of 3 (per hand)", "2 sets of 6 (per hand)", "2 sets of 9 (per hand)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 9 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "The less you assist with your supporting arm, the harder this exercise. Start by gripping firmly and start softening your grip as you approach Level 3 of this exercise. You’ll know you’re almost ready to move on when you feel like you can do this exercise assisting with only a flat palm!\n" +
                    "\n" +
                    "If your supporting hand leaves bruises on your forearm, you may be supporting too much. Over time, allow a firm grip that doesn’t leave bruises. Your working arm will get stronger as a result.\n" +
                    "\n" +
                    "As with Narrow Pullups, this exercise is usually done with an underhand grip.\n" +
                    "\n" +
                    "If you are using Gymnastic Rings, you may be able to do this on one ring. Make sure the single ring can support your weight!\n" +
                    "\n" +
                    "Video yourself and watch back between sets to monitor your form!",
            "1. Stand below a horizontal bar or rings\n" +
                    "\n" +
                    "2. Firmly grasp the bar with one hand. Use your other hand and placing it on your the forearm of your working arm. \n" +
                    "\n" +
                    "3. Ascend slowly until your chest gently touches your hand.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_advanced_one_hand_pull_ups_gif, 0
        )

        pullUpsList.add(advancedOneHandPullUps)

        val archerPullUps = PullUpModel(
            9, "Archer Pull Ups", "2 sets of 3 (per hand)", "2 sets of 6 (per hand)", "2 sets of 9 (per hand)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 9 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "The straighter your assisting arm, the more difficult this exercise. You may find it difficult to have a completely straight arm at first. Use a slightly bent arm at first if necessary. Straighten over time.\n" +
                    "\n" +
                    "Grip position is up to the preferences of the user. If you build the previous exercises with an underhand grip, it’s a good idea to use a mixed grip - underhand with your working arm and overhand with your assisting arm. \n" +
                    "\n" +
                    "The width between your hands is slightly dependent on the proportions and mobility of the user. Twice shoulder width is a good starting point for many people.\n" +
                    "\n" +
                    "If you are doing this exercise on Gymnastic Rings, experiment with the width between the rings. If they’re too wide, the straps may slide. Slightly less than shoulder width seems to work. \n" +
                    "\n" +
                    "Video yourself and watch back between sets to monitor your form!",
            "1. Stand below a horizontal bar or rings\n" +
                    "\n" +
                    "2. Firmly grasp the bar with both hands. Your hands should be around twice shoulder width. Your arms should be relatively straight.\n" +
                    "\n" +
                    "3. Ascend slowly until your chest gently touches your hand.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_archer_pull_ups_gif, 0
        )

        pullUpsList.add(archerPullUps)

        val oneArmPullUps = PullUpModel(
            10, "One Arm Pull Ups", "1 set of 1 (per hand)", "2 sets of 3 (per hand)", "2 sets of 6 (per hand)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets." +
                    "Once you can do 2 Sets of 6 (Level 3) with GOOD FORM, you are ready to move on to a harder Pullup variation.",
            "Whatever progressions you use to build up to this step, strive to be able to do it with clean form and without joint pain. Train for strength, health, and ability - not ego!\n" +
                    "\n" +
                    "Grip position is up to the preferences of the user. Some might find an underhand grip easier, but it appears to be dependent on the individual. Strive to master all grip types.\n" +
                    "\n" +
                    "If you are using Gymnastic Rings, you may be able to do this on one ring. Make sure the single ring can support your weight!\n" +
                    "\n" +
                    "Video yourself and watch back between sets to monitor your form!\n" +
                    "\n" +
                    "Allow your shoulder blades to move naturally. Retract them at the top and protract them at the bottom.",
            "1. Stand below a horizontal bar or rings\n" +
                    "\n" +
                    "2. Firmly grasp the bar with one hand. Your working arm should be straight. \n" +
                    "\n" +
                    "3. Ascend slowly until your chin is above the bar or rings. Allow your free arm to move freely for balance.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_one_arm_pull_ups_gif, 0
        )

        pullUpsList.add(oneArmPullUps)

        return pullUpsList
    }
}