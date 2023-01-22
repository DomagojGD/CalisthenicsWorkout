package com.example.calisthenicsworkout.models.pushups

import com.example.calisthenicsworkout.R
import java.util.*

object PushUpsList {

    fun setPushUpsList(): ArrayList<PushUpModel> {

        val pushUpsList = ArrayList<PushUpModel>()

        val wallPushUps = PushUpModel(
            1,
            "Wall Push Ups",
            "2 sets of 30",
            "2 sets of 50",
            "3 sets of 50",
            false, false, false,
            "Start by doing 2 Sets of as many as you can OR 50. " +
                    "Once you can do 2 Sets of 50, add a third Set. Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 50 (Level 3) with GOOD FORM, you are ready to move on to a harder " +
                    "Pushup variation.",
            "Slow and steady wins the race on this exercise. " +
                    "Don’t just speed through these. Find a controlled, rhythmic pace to really feel this movement. " +
                    "2 Seconds Down, 1 Second Pause, 2 Seconds Up. Repeat.\n" +
                    "\n" +
                    "Keep your hands around chest height. " +
                    "Hands placed too high put more work on our elbows than we need at the moment. " +
                    "Hands placed too low make it difficult to keep our palms flat. " +
                    "A good “rule of thumb” is being able to maintain flat palms and feel a slight stretch in your wrist " +
                    "while your arms are straight.\n" +
                    "\n" +
                    "Keep your body firm. Don’t arch your body at the bottom to make the motion easier. " +
                    "Core strength is important for all calisthenics, and this is a great place to start building it.",
            "1. Stand at arm’s length facing a wall.\n" +
                    "\n" +
                    "2. Place your flat palms on the wall. Your arms should be straight.\n" +
                    "\n" +
                    "3. Descend slowly until your head gently touches the wall. \n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat",
            R.drawable.wall_push_up_gif,
            0
        )

        pushUpsList.add(wallPushUps)

        val inclinePushUps = PushUpModel(
            2,
            "Incline Push Ups",
            "2 sets of 20",
            "2 sets of 30",
            "3 sets of 40",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 40 (Level 3) with GOOD FORM, you are ready to move on to a harder Pushup variation.",
            "You may not be able to find something exactly at sternum height. " +
                    "That’s okay. Work with what you have. Just make sure the base is safe and secure. Safety first! " +
                    "You can push the object against a wall for extra stability. \n" +
                    "\n" +
                    "Like with Wall Pushups, how you position your hands relative to your body makes a difference. " +
                    "At the bottom position of the exercise, your hands should be next to your chest. " +
                    "If they’re by your shoulders, try to move your feet closer or find a slightly lower base.\n" +
                    "\n" +
                    "Your core strength begins to get tested here. Keep your body firm and straight. " +
                    "Don’t let your lower back sag. " +
                    "These earlier variations will help build a solid foundation for the harder Pushups!\n" +
                    "\n" +
                    "Keep your arms approximately shoulder width apart.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1.Stand facing your base - it should be approximately sternum height.\n" +
                    "\n" +
                    "2. Lean forward and place your hands on the base. Your arms should be straight.\n" +
                    "\n" +
                    "3. Descend slowly until your chest gently touches the base. Your hands may brush your chest.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat",
            R.drawable.incline_push_up_gif,
            0
        )

        pushUpsList.add(inclinePushUps)

        val advancedInclinePushUps = PushUpModel(
            3,
            "Advanced Incline Push Ups",
            "2 sets of 20",
            "2 sets of 30",
            "3 sets of 35",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 35 (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "Filming yourself and watching back is a good idea for all exercises, but especially this one. " +
                    "You can even review your form as you’re resting between sets. " +
                    "If your butt is too high or your lower back is sagging, adjust as needed and try again!\n" +
                    "\n" +
                    "You may not be able to find something exactly at hip height. " +
                    "That’s okay. Work with what you have. Just make sure the base is safe and secure. " +
                    "Safety first! You can push the object against a wall for extra stability. \n" +
                    "\n" +
                    "Like with Wall Pushups, how you position your hands relative to your body makes a difference. " +
                    "At the bottom position of the exercise, your hands should be next to your chest. " +
                    "If they’re by your shoulders, try to move your feet closer or find a slightly lower base.\n" +
                    "\n" +
                    "Your core strength begins to get tested here. Keep your body firm and straight. " +
                    "Don’t let your lower back sag. " +
                    "These earlier variations will help build a solid foundation for the harder Pushups!\n" +
                    "\n" +
                    "Keep your arms approximately shoulder width apart.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1. Stand facing your base - it should be approximately hip height.\n" +
                    "\n" +
                    "2. Lean forward and place your hands on the base. Your arms should be straight.\n" +
                    "\n" +
                    "3. Descend slowly until your chest gently touches the base. Your hands may brush your chest.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat",
            R.drawable.advanced_incline_push_up_gif,
            0
        )

        pushUpsList.add(advancedInclinePushUps)

        val kneePushUps = PushUpModel(
            4,
            "Knee Push Ups",
            "2 sets of 10",
            "2 sets of 20",
            "3 sets of 30",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 30 (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "For some reason, it’s common to let the lower back sag during this exercise. " +
                    "Do your best to keep your body aligned from your head to your knees.\n" +
                    "\n" +
                    "Place your hands below your chest. They shouldn’t be too far towards your head or towards your knees. " +
                    "Find the balance.\n" +
                    "\n" +
                    "Some people have wrist pain during this exercise. " +
                    "Doing some warmups with the easier variations can help. Stretch your wrists beforehand.\n" +
                    "\n" +
                    "Keep your arms approximately shoulder width apart.\n" +
                    "\n" +
                    "Keep your knees together.",
            "1. Kneel on the floor with your knees together.\n" +
                    "\n" +
                    "2. Lean forward and place your hands on the ground. " +
                    "Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "3. Descend slowly until your chest gently touches the floor. Your hands may brush your chest.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat",
            R.drawable.knee_push_up_gif,
            0
        )

        pushUpsList.add(kneePushUps)

        val fullPushUps = PushUpModel(
            5,
            "Full Push Ups",
            "2 sets of 5",
            "2 sets of 15",
            "3 sets of 25",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 25 (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "You might be tempted to sag your lower body or chest. " +
                    "This makes this exercise easier by allowing you to touch your chest despite not descending as deeply. " +
                    "Keep your body aligned from your head to your feet!\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Place your hands below your chest. They shouldn’t be too far towards your head or towards your knees. " +
                    "Find the balance.\n" +
                    "\n" +
                    "Some people have wrist pain during this exercise. Doing some warmups with the easier variations can help. " +
                    "Stretch your wrists beforehand.\n" +
                    "\n" +
                    "If you have a wrist injury, doing these on your knuckles is a temporary solution.\n" +
                    "\n" +
                    "Keep your arms approximately shoulder width apart.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1. Kneel on the floor with your knees together.\n" +
                    "\n" +
                    "2. Lean forward and place your hands on the ground. Straighten your knees. " +
                    "Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "3. Descend slowly until your chest gently touches the floor. Your hands may brush your chest.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back up.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat",
            R.drawable.full_push_up_gif,
            0
        )

        pushUpsList.add(fullPushUps)

        val narrowPushUps = PushUpModel(
            6,
            "Narrow Push Ups",
            "2 sets of 5",
            "2 sets of 10",
            "3 sets of 20",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 20 (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "Your thumbs don’t have to form a “diamond.” " +
                    "Doing this flares your elbows a bit more, which increases pectoral activation. " +
                    "However, if this irritates your elbow, you can tuck your thumbs in for now. " +
                    "Just touch your index fingers together. You can always come back to this when you’re stronger.\n" +
                    "\n" +
                    "If touching the tip of your index fingers is too difficult, " +
                    "simply start with a Full Pushup and move your hands a few inches closer together. " +
                    "Work these until you feel strong enough to move them closer again. Repeat.\n" +
                    "\n" +
                    "Keep your body aligned. Don’t sag!\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Place your hands below your chest. They shouldn’t be too far towards your head or towards your knees. " +
                    "Find the balance.\n" +
                    "\n" +
                    "Some people have wrist pain during this exercise. Doing some warmups with the easier variations can help. " +
                    "Stretch your wrists beforehand.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1. Kneel on the floor with your knees together. \n" +
                    "\n" +
                    "2. Lean forward and place your hands on the ground. The tip of your index fingers should be touching.\n" +
                    "\n" +
                    "3.Straighten your knees. Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "4. Descend slowly until your chest gently touches the floor. Your hands may brush your chest.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6. Slowly come back up.\n" +
                    "\n" +
                    "7. Pause for 1 Second.\n" +
                    "\n" +
                    "8. Repeat 4-7.",
            R.drawable.narrow_push_up_gif,
            0
        )

        pushUpsList.add(narrowPushUps)

        val sideStaggeredPushUps = PushUpModel(
            7,
            "Side Staggered Push Ups",
            "2 sets of 5 (per side)",
            "2 sets of 10 (per side)",
            "2 sets of 20 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 20 per side (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "Try to go straight up and down. If you find yourself leaning towards your assisting arm, " +
                    "then simply bring it closer until you’re able to go straight up and down. Leaning makes the exercise easier.\n" +
                    "\n" +
                    "Start with your assisting arm 2 palms’ length away from your torso. Adjust as needed.\n" +
                    "\n" +
                    "Keep your body aligned. Don’t sag!\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1. Kneel on the floor with your knees together. \n" +
                    "\n" +
                    "2. Lean forward and place your hands on the ground. " +
                    "Place your working hand under your chest and your assisting arm 2 palms length away from your torso.\n" +
                    "\n" +
                    "3.Straighten your knees. Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "4. Descend slowly until your chest gently touches the floor. Your working hand may brush your chest.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6. Slowly come back up.\n" +
                    "\n" +
                    "7. Pause for 1 Second.\n" +
                    "\n" +
                    "8. Repeat 4-7.",
            R.drawable.side_staggered_push_up_gif,
            0
        )

        pushUpsList.add(sideStaggeredPushUps)

        val archerPushUps = PushUpModel(
            8,
            "Archer Push Ups",
            "2 sets of 5 (per side)",
            "2 sets of 9 (per side)",
            "2 sets of 12 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 12 per side (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "Work one side at a time to maintain time under tension.\n" +
                    "\n" +
                    "Unlike the Side-Staggered Pushups, we DON’T want to go straight up and down. " +
                    "Lean heavily towards your working arm.\n" +
                    "\n" +
                    "Start with your arms twice shoulder width. Ideally, both arms would be straight at the beginning.\n" +
                    "\n" +
                    "Do your best to keep your body aligned from your feet to your head. Your hips may lean one way at first. Straighten over time.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1. Kneel on the floor with your knees together. \n" +
                    "\n" +
                    "2. Lean forward and place your hands twice shoulder width on the ground.\n" +
                    "\n" +
                    "3. Straighten your knees. Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "4. Keeping your support arm straight, descend towards your working hand slowly " +
                    "until your chest gently touches the floor. Your working hand may brush your chest.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6.Slowly come back up.\n" +
                    "\n" +
                    "7.Pause for 1 Second.\n" +
                    "\n" +
                    "8.Repeat 4-7.",
            R.drawable.archer_push_up_gif,
            0
        )

        pushUpsList.add(archerPushUps)

        val slidingOneArmPushUps = PushUpModel(
            9,
            "Sliding One Arm Push Ups",
            "2 sets of 5 (per side)",
            "2 sets of 9 (per side)",
            "2 sets of 12 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 12 per side (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "Work one side at a time to maintain time under tension.\n" +
                    "\n" +
                    "Go straight up and down. If your body starts to lean towards your supporting arm, " +
                    "concentrate on tensing your core muscles to bring it back straight.\n" +
                    "\n" +
                    "Start with your arms twice shoulder width and then move your working hand under your chest.\n" +
                    "\n" +
                    "Do your best to keep your body aligned from your feet to your head. Your hips may lean one way at first. " +
                    "Straighten over time.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1. Kneel on the floor with your knees together. \n" +
                    "\n" +
                    "2. Lean forward and place your hands one the ground. " +
                    "One underneath your chest (like in Full Push ups) and the other held away from your body.\n" +
                    "\n" +
                    "3. Straighten your knees. Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "4. Descend straight down slowly until your chest gently touches the floor. Your working hand may brush your chest.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6.Slowly come back up.\n" +
                    "\n" +
                    "7.Pause for 1 Second.\n" +
                    "\n" +
                    "8.Repeat 4-7.",
            R.drawable.sliding_one_arm_push_up_gif,
            0
        )

        pushUpsList.add(slidingOneArmPushUps)

        val oneArmPushUps = PushUpModel(
            10,
            "One Arm Push Ups",
            "2 sets of 3 (per side)",
            "2 sets of 6 (per side)",
            "2 sets of 9 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 9 per side (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "Keep your feet a bit wider than shoulder width. " +
                    "This is the first Push up variation in this series where your feet aren’t together. " +
                    "This is for balance reasons.\n" +
                    "\n" +
                    "Work one side at a time to maintain time under tension.\n" +
                    "\n" +
                    "Try to keep your shoulders parallel to the ground. " +
                    "Tilting your non-working shoulder away from the ground can make this movement much easier. " +
                    "This is okay at first. Over time, level out your shoulders.\n" +
                    "\n" +
                    "Try to go straight up and down. Even very strong athletes sometimes have a slight shift at the bottom. " +
                    "This is weakness in this range of motion. Again, it may be unavoidable at first. Control it over time.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.",
            "1. Kneel on the floor with your knees together. \n" +
                    "\n" +
                    "2. Lean forward and place one hand on the ground. Place the other on your thigh.\n" +
                    "\n" +
                    "3. Straighten your knees. Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "4. Descend straight down slowly until your chest gently touches the floor. Your working hand may brush your chest.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6.Slowly come back up.\n" +
                    "\n" +
                    "7.Pause for 1 Second.\n" +
                    "\n" +
                    "8.Repeat 4-7.",
            R.drawable.one_arm_push_up_gif,
            0
        )

        pushUpsList.add(oneArmPushUps)

        val advancedOneArmPushUps = PushUpModel(
            11,
            "Advanced One Arm Push Ups",
            "2 sets of 3 (per side)",
            "2 sets of 6 (per side)",
            "2 sets of 9 (per side)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. " +
                    "Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 9 per side (Level 3) with GOOD FORM, " +
                    "you are ready to move on to a harder Pushup variation.",
            "Keep your feet together and allow your waist to twist towards your working side. " +
                    "Balance will require you to twist more on the descent.\n" +
                    "\n" +
                    "Try to keep your shoulders parallel to the ground. " +
                    "Tilting your non-working shoulder away from the ground can make this movement much easier. " +
                    "This is okay at first. Over time, level out your shoulders.\n" +
                    "\n" +
                    "Try to go straight up and down. Even very strong athletes sometimes have a slight shift at the bottom. " +
                    "This is weakness in this range of motion. Again, it may be unavoidable at first. Control it over time.\n" +
                    "\n" +
                    "Film yourself and watch back between sets to check your form. A mirror is also useful.\n" +
                    "\n" +
                    "Keep your feet together.",
            "1. Kneel on the floor with your knees together. \n" +
                    "\n" +
                    "2. Lean forward and place one hand on the ground. Place the other on your thigh.\n" +
                    "\n" +
                    "3. Straighten your knees. Your arms should be straight and your body aligned from your head to knees.\n" +
                    "\n" +
                    "4. Descend straight down slowly until your chest gently touches the floor. Your working hand may brush your chest.\n" +
                    "\n" +
                    "5. Pause for 1 Second.\n" +
                    "\n" +
                    "6.Slowly come back up.\n" +
                    "\n" +
                    "7.Pause for 1 Second.\n" +
                    "\n" +
                    "8.Repeat 4-7.",
            R.drawable.advanced_one_arm_push_up_gif,
            0
        )

        pushUpsList.add(advancedOneArmPushUps)

        return pushUpsList
    }
}