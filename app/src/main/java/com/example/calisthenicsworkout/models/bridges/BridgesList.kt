package com.example.calisthenicsworkout.models.bridges

import com.example.calisthenicsworkout.R

object BridgesList {

    fun setBridgesList(): ArrayList<BridgesModel>{

        val bridgesList = ArrayList<BridgesModel>()

        val gluteBridges = BridgesModel(1, "Glute Bridges",
            "2 sets of 15", "2 sets of 30", "3 sets of 50",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 50 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Your foot placement affects difficulty. Try to keep your shins perpendicular to the ground and/or have your heels a few inches from your butt.\n" +
                    "\n" +
                    "Try to avoid sagging at the hips. If this is difficult, moving your feet closer or pressing more with your arms sometimes helps.\n" +
                    "\n" +
                    "Have your legs around shoulder width apart.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out.\n" +
                    "\n" +
                    "Slow and steady wins the race on this exercise. Don’t just speed through these. Find a controlled, rhythmic pace to really feel this movement. 2 Seconds Down, 1 Second Pause, 2 Seconds Up. Repeat.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. \n" +
                    "\n" +
                    "Tighten your core and abs during the movement. You want to feel your body “hinge” at the hips. " +
                    "This is similar to the movement of Jackknife Squats and Jackknife Pullups!",
            "1. Lie on your back with your knees bent. Your legs should be shoulder width apart.\n" +
                    "\n" +
                    "2. Contract your glutes while maintaining a neutral back. This should thrust your hips upward.\n" +
                    "\n" +
                    "3. Continue this movement until your thighs, trunk, and torso are in a straight line.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 2-6.",
            R.drawable.ic_glute_bridges_gif, 0)

        bridgesList.add(gluteBridges)

        val straightBridges = BridgesModel(2, "Straight Bridges",
            "2 sets of 15", "2 sets of 25", "3 sets of 30",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Ideal form in this exercise starts from your body at slightly wider than a right angle and transitions into a straight line. This will involve your shoulder blades retracting, which may help you with your overall posture.\n" +
                    "\n" +
                    "Try to avoid sagging at the hips. If this is difficult, try bending your knees a bit.\n" +
                    "\n" +
                    "Have your legs together.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Point your toes forward.\n" +
                    "\n" +
                    "Try to keep your back neutral throughout the exercise. \n" +
                    "\n" +
                    "Tighten your core and abs during the movement. You want to feel your body “hinge” at the hips. " +
                    "This is similar to the movement of Jackknife Squats and Jackknife Pullups!",
            "1. Sit on the floor with your legs in front of you. Your palms should be by your hips. Your body should form an angle slightly wider than a right angle.\n" +
                    "\n" +
                    "2. Push through your arms and contract your glutes to begin the movement. Keep your arms and legs straight and bring your shoulders back.\n" +
                    "\n" +
                    "3. Continue this movement until your body is in a straight line supported by your heels and palms.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly come back down.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 2-6.",
            R.drawable.ic_straight_bridges_gif, 0)

        bridgesList.add(straightBridges)

        val wallBridges = BridgesModel(3, "Wall Bridges",
            "2 sets of 15", "2 sets of 25", "3 sets of 30",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 3 Sets of 30 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. Walk around the room while breathing normally before returning to your exercise set.\n" +
                    "\n" +
                    "Try to externally rotate your shoulders during this exercise. This meaning rotating your upper arms away from your body. It may help you to envision trying to bring your elbows together.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Point your toes forward.\n" +
                    "\n" +
                    "Try to arch your back evenly. Don’t hinge at one point while keeping the rest straight. Imagine your back being as curved as the letter U.\n" +
                    "\n" +
                    "Your abs will stretch during this exercise. You can maintain tension in them - " +
                    "but they should stretch to allow your lower back to contract. This is normal!",
            "1. Stand 30 cm away from a wall. Your arms should be by your side and your legs shoulder width apart.\n" +
                    "\n" +
                    "2. Bring your arms back until your palms touch the wall. Your fingers should be pointed down.\n" +
                    "\n" +
                    "3. Lean backwards, trying to move one spinal vertebrae at a time, until your head gently touches the wall.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly reverse the movement.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_wall_bridges_gif, 0)

        bridgesList.add(wallBridges)

        val inclineBridges = BridgesModel(4, "Incline Bridges",
            "2 sets of 10", "2 sets of 20", "2 sets of 25",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 25 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Your wrist positioning is key on this exercise. Don’t have your wrists so far back that they have to contort to support your body. If you’re using a bench, place them on the edge.\n" +
                    "\n" +
                    "Use a stable platform. Make sure it does not wiggle around or move. Anything glass or fragile is out of the question.\n" +
                    "\n" +
                    "Using a “squishy” surface like a bed might make this exercise harder on your wrists. A stable bench is a good standard for this exercise.\n" +
                    "\n" +
                    "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. Walk around the room while breathing normally before returning to your exercise set.\n" +
                    "\n" +
                    "Try to externally rotate your shoulders during this exercise. This meaning rotating your upper arms away from your body. It may help you to envision trying to bring your elbows together.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Point your toes forward.\n" +
                    "\n" +
                    "Try to arch your back evenly. Don’t hinge at one point while keeping the rest straight. Imagine your back being as curved as the letter U.\n" +
                    "\n" +
                    "Your abs will stretch during this exercise. You can maintain tension in them- " +
                    "but they should stretch to allow your lower back to contract. This is normal!",
            "1. Sit in front of a platform around thigh height. A bench is a good standard. Your arms should be by your side and your legs shoulder width apart.\n" +
                    "\n" +
                    "2. Lean back until your head and palms touch the object. Lift your hips until your body is support by your head, palms, and feet.\n" +
                    "\n" +
                    "3. Lean backwards, trying to move on spinal vertebrae at a time, until your body is arched and your head is clear of the platform.\n" +
                    "\n" +
                    "4. Pause for 1 Second.\n" +
                    "\n" +
                    "5. Slowly reverse the movement.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_incline_bridges_gif, 0)

        bridgesList.add(inclineBridges)

        val headBridges = BridgesModel(5, "Head Bridges",
            "2 sets of 5", "2 sets of 10", "2 sets of 25",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 25 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "It’s important to find the right platform for this exercise. Make sure it is safe, secure, and stable. You do not want to fall on the platform. However, if you do, make sure it can support your weight. A cushioned stool may work well.\n" +
                    "\n" +
                    "Try to keep your bridge “even.” Don’t lean too far towards your feet or your palms. Try to keep it balanced. If your wrists hurt, you may need to move towards your palms a bit.\n" +
                    "\n" +
                    "Full-body activation really comes into play here. Try to imagine each vertebrae of your body moving back at a time. \n" +
                    "\n" +
                    "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. Walk around the room while breathing normally before returning to your exercise set.\n" +
                    "\n" +
                    "Try to externally rotate your shoulders during this exercise. This meaning rotating your upper arms away from your body. It may help you to envision trying to bring your elbows together.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Point your toes forward.\n" +
                    "\n" +
                    "Try to arch your back evenly. Don’t hinge at one point while keeping the rest straight. Imagine your back being as curved as the letter U upside down.\n" +
                    "\n" +
                    "Your abs will stretch during this exercise. You can maintain tension in them- " +
                    "but they should stretch to allow your lower back to contract. This is normal!",
            "1, Sit on a platform around knee height. Your legs should be around shoulder width.\n" +
                    "\n" +
                    "2. Lean back until your head and palms touch the floor. Use the platform to support your lower body as you arch back.\n" +
                    "\n" +
                    "3. Lean backwards, pushing through your palms and feet until your head and back are clear of the floor. You should be in a Full Bridge position - supported only be your palms and feet!\n" +
                    "\n" +
                    "4. Pause for 5 Seconds. Breathing evenly and feeling your muscles stretch.\n" +
                    "\n" +
                    "5. Slowly reverse the movement.\n" +
                    "\n" +
                    "6. Pause for 1 Second.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_head_bridges_gif, 0)

        bridgesList.add(headBridges)

        val fullBridges = BridgesModel(6, "Full Bridges",
            "2 sets of 5", "2 sets of 10", "2 sets of 15",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 15 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "The difficulty of this exercise is affected by the distance between your hands and feet. Don’t start with them too close. Experiment with the distance.\n" +
                    "\n" +
                    "Try to straighten your arms.\n" +
                    "\n" +
                    "Try to straighten your legs.\n" +
                    "\n" +
                    "Try to retract your scapula and bring your shoulders back.\n" +
                    "\n" +
                    "Try to keep your bridge “even.” Don’t lean too far towards your feet or your palms. Try to keep it balanced. If your wrists hurt, you may need to move towards your palms a bit.\n" +
                    "\n" +
                    "Full-body activation really comes into play here. Try to imagine each vertebrae of your body moving back at a time. \n" +
                    "\n" +
                    "Try to externally rotate your shoulders during this exercise. This meaning rotating your upper arms away from your body. It may help you to envision trying to bring your elbows together.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Point your toes forward.\n" +
                    "\n" +
                    "Try to arch your back evenly. Don’t hinge at one point while keeping the rest straight. Imagine your back being as curved as the letter U upside down.\n" +
                    "\n" +
                    "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. " +
                    "Walk around the room while breathing normally before returning to your exercise set.",
            "1. Lie on your back with your knees bent. Your heels should be a few inches away from your butt.\n" +
                    "\n" +
                    "2. Reach back until your palms touch the floor. Your hands should be next to your head with your fingers pointing towards your feet.\n" +
                    "\n" +
                    "3. Push through your palms and feet while arching your back until your arms and legs are as straight as you can make them. You should be in a Full Bridge position - supported only be your palms and feet!\n" +
                    "\n" +
                    "4. Pause for 5 Seconds. Breathing evenly and feeling your muscles stretch.\n" +
                    "\n" +
                    "5. Slowly reverse the movement.\n" +
                    "\n" +
                    "6. Pause for 5 Seconds.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_full_bridges_gif, 0)

        bridgesList.add(fullBridges)

        val wheelBridges = BridgesModel(7, "Wheel Bridges",
            "2 sets of 5", "2 sets of 10", "2 sets of 15",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 15 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Video yourself doing these exercises and watch back in between sets.\n" +
                    "\n" +
                    "Start with your heels a few inches from your butt.\n" +
                    "\n" +
                    "Try to straighten your arms.\n" +
                    "\n" +
                    "Try to straighten your legs.\n" +
                    "\n" +
                    "Try to retract your scapula and bring your shoulders back.\n" +
                    "\n" +
                    "Try to breathe normally.\n" +
                    "\n" +
                    "Try to keep your bridge “even.” Don’t lean too far towards your feet or your palms. Try to keep it balanced. If your wrists hurt, you may need to move towards your palms a bit.\n" +
                    "\n" +
                    "Full-body activation really comes into play here. Try to imagine each vertebrae of your body moving back at a time. \n" +
                    "\n" +
                    "Try to arch your back evenly. Don’t hinge at one point while keeping the rest straight. Imagine your back being as curved as the letter U upside down.\n" +
                    "\n" +
                    "Try to externally rotate your shoulders during this exercise. This meaning rotating your upper arms away from your body. It may help you to envision trying to bring your elbows together.\n" +
                    "\n" +
                    "Your feet should point forward or slightly out. Point your toes forward.\n" +
                    "\n" +
                    "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. " +
                    "Walk around the room while breathing normally before returning to your exercise set.",
            "1. Lie on your back with your knees bent. Your heels should be a few inches away from your butt.\n" +
                    "\n" +
                    "2. Reach back until your palms touch the floor. Your hands should be next to your head with your fingers pointing towards your feet.\n" +
                    "\n" +
                    "3. Push through your palms and feet while arching your back until your arms and legs are as straight as you can make them. You should be in a Full Bridge position - supported only be your palms and feet!\n" +
                    "\n" +
                    "4. Pause for 10 Seconds. Use this time to stretch and move your body into place.\n" +
                    "\n" +
                    "5. Slowly reverse the movement.\n" +
                    "\n" +
                    "6. Pause for 10 Seconds.\n" +
                    "\n" +
                    "7. Repeat 3-6.",
            R.drawable.ic_wheel_bridges_gif, 0)

        bridgesList.add(wheelBridges)

        val tapBridges = BridgesModel(8, "Tap Bridges",
            "2 sets of 5 taps (per side, alternating)", "2 sets of 20 taps (per side, alternating)", "2 sets of 30 taps (per side, alternating)",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 sets of 30 taps alternating per side (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Video yourself during this exercise and watch back in between sets.\n" +
                    "\n" +
                    "Try to establish full balance with each “tap.” If you feel like you have to rush to quickly touch your head and the ground again to avoid falling, spend extra time just learning to balance on your arms.\n" +
                    "\n" +
                    "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. " +
                    "Walk around the room while breathing normally before returning to your exercise set.",
            "1. Lie on your back with your knees bent. Your heels should be a few inches away from your butt.\n" +
                    "\n" +
                    "2. Lean back and push yourself into a Wheel Bridge or Full Bridge. \n" +
                    "\n" +
                    "3. Steadily shift weight onto one arm until you are able to lift the other arm entirely.\n" +
                    "\n" +
                    "4. Tap your head or opposing shoulder briefly before returning your hand to the ground.\n" +
                    "\n" +
                    "5. Repeat this motion for the other side.\n" +
                    "\n" +
                    "6. Repeat 3-5.",
            R.drawable.ic_tap_bridges_gif, 0)

        bridgesList.add(tapBridges)

        val wallWalkingBridges = BridgesModel(9, "Wall Walking Bridges",
            "1 set of 3", "1 set of 6", "2 sets of 10",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 10 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Video yourself during this exercise and watch back in between sets.\n" +
                    "\n" +
                    "Make sure your hands on the wall AND your feet on the ground are very secure. Don’t wear only socks while doing this exercise. If you feel yourself “sliding” while leaning back, either go barefoot or find a wall, floor, and pair of shoes that allow you to be stable.\n" +
                    "\n" +
                    "Try to establish full balance with each step. Do not rush to quickly go down the wall. This will only lead to injury.\n" +
                    "\n" +
                    "Stand approximately arm’s length away from the wall. Adjust as necessary. \n" +
                    "\n" +
                    "Leaning back and placing the first hand may lead to dizziness even more than the previous exercises. See below for more information on this.\n" +
                    "\n" +
                    "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. " +
                    "Walk around the room while breathing normally before returning to your exercise set.",
            "1. Stand arm’s length away from a stable wall. Your feet should be shoulder width apart.\n" +
                    "\n" +
                    "2. Lean back steadily, start from your hips and “feeling” each vertebrae move at a time, and place one palm on the wall behind you. \n" +
                    "\n" +
                    "3. Do the same with your other palm, placing it slightly below the palm already on the wall.\n" +
                    "\n" +
                    "4. Repeat this with each arm, “walking” yourself down the wall until your palms are on the ground in a Wheel Bridge or Full Bridge.\n" +
                    "\n" +
                    "5. Take a deep breath to regain your bearings.\n" +
                    "\n" +
                    "6. Lift one palm off the ground and place it securely against the wall.\n" +
                    "\n" +
                    "7. Repeat the same with your other palm, placing it slightly above the palm already on the wall.\n" +
                    "\n" +
                    "8. Repeat this with each arm until you are able to stand back up as you were in step 1.\n" +
                    "\n" +
                    "9.Repeat 2-8.",
            R.drawable.ic_walking_wall_bridges_gif, 0)

        bridgesList.add(wallWalkingBridges)

        val standToStandBridges = BridgesModel(10, "Stand To Stand Bridges",
            "1 set of 1", "1 set of 3", "2 sets of 5",
            false, false, false,
            "Do 2-3 Sets of as many as you can. The levels above are standards you can use to measure your progress. Rest 2-3 minutes between Sets. " +
                    "Once you can do 2 Sets of 5 (Level 3) with GOOD FORM, you are ready to move on to a harder Bridge variation.",
            "Video yourself during this exercise and watch back in between sets.\n" +
                    "\n" +
                    "Make sure you are in a secure, safe area. No running kids, pets, or general hectic activity. You want to be able to focus for your own safety and balance.\n" +
                    "\n" +
                    "This exercise is easier if you bend your knees or spread your feet far apart. Aim to do this exercise with your feet shoulder width apart and toes pointing forward or slightly out.\n" +
                    "\n" +
                    "Leaning back may lead to dizziness even more than the previous exercises. See below for more information on this.\n" +
                    "\n" +
                    "Breathe normally throughout this exercise. This is very important. The new positioning in our body can make our blood rush to and from our head. If we hold our breath and suddenly release it, this may result in severe dizziness. \n" +
                    "\n" +
                    "If you feel dizzy, stop immediately and take a break. " +
                    "Walk around the room while breathing normally before returning to your exercise set.",
            "1. Stand upright in a safe and secure location. Your feet should be shoulder width apart. Your hands should be on your hips.\n" +
                    "\n" +
                    "2. Lean back steadily by pushing your hips forward and “feeling” each vertebrae move at a time.\n" +
                    "\n" +
                    "3. Keep leaning back until you are able to gently place one palm on the ground. You shouldn’t need to fall on the palm.\n" +
                    "\n" +
                    "4. After you are set, place your other palm on the ground. You should be in a Wheel Bridge or Full Bridge position.\n" +
                    "\n" +
                    "5. Take a deep breath to regain your bearings.\n" +
                    "\n" +
                    "6. Slowly reverse the movement by pushing through one palm and lifting the other until you are able to stand back up.\n" +
                    "\n" +
                    "7. Place your hands back on your hips while you stand upright. Take a moment to gather your bearings.\n" +
                    "\n" +
                    "8. Repeat 2-7.",
            R.drawable.ic_stand_to_stand_bridges_gif, 0)

        bridgesList.add(standToStandBridges)

        return bridgesList
    }
}